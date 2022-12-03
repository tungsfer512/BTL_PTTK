package io.team05.btl.controller.daoimpl;

import java.util.ArrayList;
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
    @Autowired
    CartRepository cartRepository;
    @Autowired
    CommentRepository commentRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    PaymentRepository paymentRepository;
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> filterInAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> searchInAll(String keyword) {
        keyword = keyword.toLowerCase();
        List<Product> list = productRepository.findAll();
        List<Product> listRes = new ArrayList<>();
        for (Product product : list) {
            if(product.getTitle().toLowerCase().contains(keyword)||
            product.getDescription().toLowerCase().contains(keyword)){
                listRes.add(product);
            }
        }
        return listRes;
    }

    @Override
    public List<Product> searchInShop(String keyword, Integer seller_id) {
        return customerRepository.searchInShop(keyword, seller_id);
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public Cart addCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Cart updateCart(Cart cart) {
        return cartRepository.findById(cart.getId()).map(existedCart -> {
            existedCart.setQuantity(cart.getQuantity());
            return cartRepository.save(existedCart);
        }).orElseGet(() -> {
            return cartRepository.save(cart);
        });
    }

    @Override
    public void deleteCartById(Integer id) {
        cartRepository.deleteById(id);
    }

    @Override
    public Order makeOrder(Order order) {
    	
        return orderRepository.save(order);
    }

    @Override
    public Order editOrder(Order order) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteOrderById(Integer id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Payment checkout(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Comment updateComment(Comment comment) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteCommentById(Integer id) {
        commentRepository.deleteById(id);
    }
}
