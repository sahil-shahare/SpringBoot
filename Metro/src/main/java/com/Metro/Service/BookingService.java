package com.Metro.Service;

import com.Metro.DTO.BookingRequestDTO;
import com.Metro.DTO.BookingResponseDTO;

public interface BookingService {

    BookingResponseDTO bookTicket(Long commutorId, BookingRequestDTO request) throws Exception;
}


