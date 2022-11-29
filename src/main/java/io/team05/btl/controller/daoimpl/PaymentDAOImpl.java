package io.team05.btl.controller.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.PaymentDAO;
import io.team05.btl.model.Payment;
import io.team05.btl.model.Shipment;
import io.team05.btl.repository.*;

@Service
public class PaymentDAOImpl implements PaymentDAO {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public Double getTotal() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Shipment getShipmentById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Payment getPaymentById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }
}
