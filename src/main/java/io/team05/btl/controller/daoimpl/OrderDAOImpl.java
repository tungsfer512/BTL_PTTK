package io.team05.btl.controller.daoimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.OrderDAO;
import io.team05.btl.model.Order;
import io.team05.btl.model.OrderDetail;
import io.team05.btl.repository.*;

@Service
public class OrderDAOImpl implements OrderDAO {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Override
    public HashMap<String, ArrayList<Order>> getAllOrder() {
        HashMap<String, ArrayList<Order>> mp = new HashMap<>();
        ArrayList<Order> orders = (ArrayList<Order>) orderRepository.findAll();
        for (Order order : orders) {
            String status = order.getStatus();
            if (mp.containsKey(status)) {
            } else {
                mp.put(status, new ArrayList<>());
            }
            mp.get(status).add(order);
        }
        return mp;
    }

    @Override
    public HashMap<String, ArrayList<Order>> getAllOrderByCustomerId(Integer id) {
        HashMap<String, ArrayList<Order>> mp = new HashMap<>();
        ArrayList<Order> orders = (ArrayList<Order>) orderRepository.getAllOrderByCustomerId(id);
        for (Order order : orders) {
            String status = order.getStatus();
            if (mp.containsKey(status)) {
            } else {
                mp.put(status, new ArrayList<>());
            }
            mp.get(status).add(order);
        }
        return mp;
    }

    @Override
    public Order getOrderById(Integer id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public List<Order> getAllOrderByProductId(Integer id) {
        return orderRepository.getAllOrderByProductId(id);
    }

    @Override
    public OrderDetail addOrderDetail(OrderDetail orderdetail) {
        return orderDetailRepository.save(orderdetail);
    }
}
