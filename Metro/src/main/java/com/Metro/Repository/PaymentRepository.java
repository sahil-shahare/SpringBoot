package com.Metro.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Metro.Entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
