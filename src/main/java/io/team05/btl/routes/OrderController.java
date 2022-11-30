package io.team05.btl.routes;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.team05.btl.controller.daoimpl.OrderDAOImpl;
import io.team05.btl.model.Order;

@RestController
@CrossOrigin
public class OrderController {
    @Autowired
    OrderDAOImpl orderDAOImpl;

    @GetMapping("api/orders")
    public HashMap<String, ArrayList<Order>> getAllOrder() {
        return orderDAOImpl.getAllOrder();
    }

    @GetMapping("api/orders/{id}")
    public Order getOrderById(@PathVariable Integer id) {
        return orderDAOImpl.getOrderById(id);
    }

    @GetMapping("api/customers/{id}/orders")
    public HashMap<String, ArrayList<Order>> getAllOrderByCustomerId(@PathVariable Integer id) {
        return orderDAOImpl.getAllOrderByCustomerId(id);
    }
}
