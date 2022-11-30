package io.team05.btl.controller.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.OrderDAO;
import io.team05.btl.model.Order;
import io.team05.btl.repository.*;

@Service
public class OrderDAOImpl implements OrderDAO {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Integer id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public List<Order> getAllOrderByCustomerId(Integer id) {
        return orderRepository.getAllOrderByCustomerId(id);
    }

    @Override
    public List<Order> getAllOrderByProductId(Integer id) {
        return orderRepository.getAllOrderByProductId(id);
    }
}
