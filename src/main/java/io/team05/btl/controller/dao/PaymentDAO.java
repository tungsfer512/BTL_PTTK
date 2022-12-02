package io.team05.btl.controller.dao;

import java.util.List;

import io.team05.btl.model.Payment;

public interface PaymentDAO {
    public Double getTotal(List<Integer> carts);
    public Payment getPaymentById(Integer id);
    public Payment addPayment(Payment payment);
}
