package io.team05.btl.controller.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.CustomerDAO;
import io.team05.btl.model.Cart;
import io.team05.btl.model.Comment;
import io.team05.btl.model.Customer;
import io.team05.btl.model.Order;
import io.team05.btl.model.Payment;
import io.team05.btl.model.Product;
import io.team05.btl.repository.*;

@Service
public class CustomerDAOImpl implements CustomerDAO {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Product> filterInAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> filterInShop() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> searchInAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> searchInShop() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Customer getCustomerById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Cart addCart(Cart cart) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Cart updateCart(Cart cart) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteCartById(Integer id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Order makeOrder(Order order) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order editOrder(Order order) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteOrderById(Integer id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Payment checkout(Payment payment) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Comment addComment(Comment comment) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Comment updateComment(Comment comment) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteCommentById(Integer id) {
        // TODO Auto-generated method stub
        
    }
}
