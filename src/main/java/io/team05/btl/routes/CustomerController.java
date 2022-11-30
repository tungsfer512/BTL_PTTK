package io.team05.btl.routes;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.team05.btl.controller.daoimpl.CartDAOImpl;
import io.team05.btl.controller.daoimpl.CustomerDAOImpl;
import io.team05.btl.controller.daoimpl.PaymentDAOImpl;
import io.team05.btl.controller.daoimpl.ProductDAOImpl;
import io.team05.btl.model.Cart;
import io.team05.btl.model.Customer;
import io.team05.btl.model.Order;
import io.team05.btl.model.Product;

@RestController
@CrossOrigin
public class CustomerController {

    @Autowired
    CartDAOImpl cartDAOImpl;
    @Autowired
    CustomerDAOImpl customerDAOImpl;
    @Autowired
    ProductDAOImpl productDAOImpl;
    @Autowired
    PaymentDAOImpl paymentDAOImpl;

    @GetMapping("api/customers/{id}/cart")
    public List<Cart> getAllCartByCustomer(@PathVariable Integer id) {
        return cartDAOImpl.getAllCartByCustomerId(id);
    }

    @PostMapping("api/customers/{id}/cart/add")
    public Cart addCart(@PathVariable Integer id, @RequestBody Object cart) {
        HashMap<String, Integer> mp = (HashMap) cart;
        Customer customer = customerDAOImpl.getCustomerById(id);
        Product product = productDAOImpl.getProductById(mp.get("product_id"));
        Integer quantity = mp.get("quantity");
        Cart save_cart = new Cart(quantity, customer, product);
        return customerDAOImpl.addCart(save_cart);
    }
    @PostMapping("api/cart/{id}/delete")
    public void deleteCart(@PathVariable Integer id) {
        customerDAOImpl.deleteCartById(id);
    }
    // not finish
    @PostMapping("api/customers/{id}/orders/add")
    public Order makeOrder(@PathVariable Integer id, @RequestBody Object order) {
        HashMap<String, List<Integer>> mp = (HashMap) order;
        List<Integer> carts = mp.get("carts");
        Customer customer = customerDAOImpl.getCustomerById(id);
        Double amount = paymentDAOImpl.getTotal(carts);
        Order save_order = new Order(amount, "pending", customer, null);
        return save_order;
    }

    @GetMapping("api/customers/{id}")
    public Customer getCustomerById(@PathVariable Integer id) {
        return customerDAOImpl.getCustomerById(id);
    }
    
    @PostMapping("api/search")
    public List<Product> searchInAll(@RequestParam String keyword) {
        return customerDAOImpl.searchInAll(keyword);
    }
    
    @PostMapping("api/shop/{id}/search")
    public List<Product> searchInShop(@PathVariable Integer id, @RequestParam String keyword) {
        return customerDAOImpl.searchInShop(keyword, id);
    }

    
}
