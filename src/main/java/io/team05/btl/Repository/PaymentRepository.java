package io.team05.btl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.team05.btl.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
