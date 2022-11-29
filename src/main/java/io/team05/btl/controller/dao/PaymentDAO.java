package io.team05.btl.controller.dao;

import io.team05.btl.model.Payment;
import io.team05.btl.model.Shipment;

public interface PaymentDAO {
    public Double getTotal();
    public Shipment getShipmentById(Integer id);
    public Payment getPaymentById(Integer id);
}
