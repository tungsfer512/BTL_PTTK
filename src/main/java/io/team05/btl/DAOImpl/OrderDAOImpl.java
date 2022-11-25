package io.team05.btl.DAOImpl;

import io.team05.btl.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDAOImpl {
    @Autowired
    OrderRepository orderRepository;
}
