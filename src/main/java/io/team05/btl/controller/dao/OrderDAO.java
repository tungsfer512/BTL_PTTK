package io.team05.btl.controller.dao;

import java.util.List;

import io.team05.btl.model.Order;

public interface OrderDAO {
    public List<Order> getAllOrder(); 
    public Order getOrderById(Integer id); 
    public List<Order> getAllOrderByCustomerId(Integer id); 
    public List<Order> getAllOrderByProductId(Integer id);
}
