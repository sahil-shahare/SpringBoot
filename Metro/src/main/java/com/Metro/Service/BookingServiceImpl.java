package com.Metro.Service;



import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Metro.DTO.BookingRequestDTO;
import com.Metro.DTO.BookingResponseDTO;
import com.Metro.DTO.PaymentRequest;
import com.Metro.Entity.Payment;
import com.Metro.Exception.GlobalExcption;
import com.Metro.Payment.Makepayment;
import com.Metro.Repository.CommutorRepository;
import com.Metro.Repository.PaymentRepository;
import com.Metro.Repository.TicketRepository;

@Service
public class BookingServiceImpl implements BookingService {

	private final CommutorRepository commutorRepo;
    private final TicketRepository ticketRepo;
    private final PaymentRepository  paymentRepo;
    private final PaymentFactory paymentFactory;

    public BookingServiceImpl(CommutorRepository commutorRepo,
                              TicketRepository ticketRepo,
                              PaymentRepository paymentRepo,
                              PaymentFactory paymentFactory) {
        this.commutorRepo = commutorRepo;
        this.ticketRepo = ticketRepo;
        this.paymentRepo = paymentRepo;
        this.paymentFactory = paymentFactory;
    }

    @Override
    @Transactional
    public BookingResponseDTO bookTicket(Long commutorId, BookingRequestDTO request) throws Exception {

        // ✅ 1. Validate Commutor
        Commutor commutor = commutorRepo.findById(commutorId)
                .orElseThrow(() -> new ResourceNotFoundException("Commutor Not Found"));

        // ✅ 2. Business Validation
        if (request.getSource().equalsIgnoreCase(request.getDestination())) {
            throw new BusinessException("Source and Destination cannot be same");
        }

        if (paymentRepo.existsByTransactionId(request.getTransactionId())) {
            throw new BusinessException("Duplicate Transaction Attempt");
        }

        // ✅ 3. Create Ticket
        Ticket ticket = new Ticket();
        ticket.setSource(request.getSource());
        ticket.setDestination(request.getDestination());
        ticket.setTicketPrice(request.getAmount());
        ticket.setCommutor(commutor);

        ticketRepo.save(ticket);

        // ✅ 4. Prepare Payment Request (Strategy Pattern)
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setAmount(request.getAmount());
        paymentRequest.setCustomerUpi(request.getCustomerUpi());
        paymentRequest.setMerchantUpi("metro@upi");
        paymentRequest.setTransactionId(request.getTransactionId());

        // ✅ 5. Dynamically Select Payment Mode
        Makepayment paymentStrategy =
                paymentFactory.getPaymentMethod(request.getPaymentType().name());

        boolean success = paymentStrategy.doPayment(paymentRequest);

        if (!success) {
            throw new PaymentFailedException("Payment Failed from Gateway");
        }

        // ✅ 6. Save Payment Entity
        Payment payment = new Payment();
        payment.setAmount(request.getAmount());
        payment.setTransactionId(request.getTransactionId());
        payment.setType(request.getPaymentType());
        payment.setTicket(ticket);

        paymentRepo.save(payment);

        // ✅ 7. Return Response DTO
        return new BookingResponseDTO(
                ticket.getId(),
                request.getSource() + " → " + request.getDestination(),
                request.getAmount(),
                "SUCCESS"
        );
    }
}
