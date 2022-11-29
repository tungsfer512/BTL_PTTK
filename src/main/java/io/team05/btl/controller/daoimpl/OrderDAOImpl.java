package io.team05.btl.controller.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.OrderDAO;
import io.team05.btl.model.Order;
import io.team05.btl.model.Payment;
import io.team05.btl.repository.*;

@Service
public class OrderDAOImpl implements OrderDAO {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrder() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order getOrderById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Order> getAllOrderByCustomerId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Order> getAllOrderByProductId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Payment getPaymentById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }
}
