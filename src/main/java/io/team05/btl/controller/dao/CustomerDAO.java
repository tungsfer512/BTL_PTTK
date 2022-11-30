package io.team05.btl.controller.dao;

import java.util.List;

import io.team05.btl.model.Cart;
import io.team05.btl.model.Comment;
import io.team05.btl.model.Customer;
import io.team05.btl.model.Order;
import io.team05.btl.model.Payment;
import io.team05.btl.model.Product;

public interface CustomerDAO {
    public List<Product> filterInAll();
    public List<Product> searchInAll(String keyword);
    public List<Product> searchInShop(String keyword, Integer seller_id);
    public Customer getCustomerById(Integer id);
    public Cart addCart(Cart cart);
    public Cart updateCart(Cart cart);
    public void deleteCartById(Integer id);
    public Order makeOrder(Order order);
    public Order editOrder(Order order);
    public void deleteOrderById(Integer id);
    public Payment checkout(Payment payment);
    public Comment addComment(Comment comment);
    public Comment updateComment(Comment comment);
    public void deleteCommentById(Integer id);
}
