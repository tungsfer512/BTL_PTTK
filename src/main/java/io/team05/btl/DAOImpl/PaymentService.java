package io.team05.btl.Service;

import io.team05.btl.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    OrderRepository orderRepository;
}
