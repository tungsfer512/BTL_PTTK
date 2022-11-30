package io.team05.btl.controller.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.team05.btl.model.Order;

public interface OrderDAO {
    public HashMap<String, ArrayList<Order>> getAllOrder(); 
    public Order getOrderById(Integer id); 
    public HashMap<String, ArrayList<Order>> getAllOrderByCustomerId(Integer id); 
    public List<Order> getAllOrderByProductId(Integer id);
}
