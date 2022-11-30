package io.team05.btl.controller.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.PaymentDAO;
import io.team05.btl.model.Payment;
import io.team05.btl.repository.*;

@Service
public class PaymentDAOImpl implements PaymentDAO {
    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentRepository.findById(id).get();
    }

    @Override
    public Double getTotal(List<Integer> carts) {
        return null;
    }
}
