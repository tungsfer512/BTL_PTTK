package io.team05.btl.routes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.team05.btl.controller.daoimpl.CartDAOImpl;
import io.team05.btl.controller.daoimpl.CustomerDAOImpl;
import io.team05.btl.controller.daoimpl.PaymentDAOImpl;
import io.team05.btl.controller.daoimpl.ProductDAOImpl;
import io.team05.btl.model.Account;
import io.team05.btl.model.Cart;
import io.team05.btl.model.Customer;
import io.team05.btl.model.Fullname;
import io.team05.btl.model.Order;
import io.team05.btl.model.Product;
import io.team05.btl.model.User;
import io.team05.btl.repository.AccountRepository;
import io.team05.btl.repository.FullnameRepository;
import io.team05.btl.repository.UserRepository;

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
    @Autowired
    UserRepository userRepository;
    @Autowired
    FullnameRepository fullnameRepository;
    @Autowired
    AccountRepository accountRepository;


    @GetMapping("api/customers/{id}/cart")
    public HashMap<String, ArrayList<Cart>> getAllCartByCustomer(@PathVariable Integer id) {
        ArrayList<Cart> carts = (ArrayList<Cart>) cartDAOImpl.getAllCartByCustomerId(id);
        HashMap<String, ArrayList<Cart>> mp = new HashMap<>();
        for (Cart cart : carts) {
            String sellerId = cart.getProduct().getSeller().getId()+ "!!!" + cart.getProduct().getSeller().getShop();
            System.out.println(sellerId);
            if (mp.containsKey(sellerId)) {
            } else {
                mp.put(sellerId, new ArrayList<>());
            }
            mp.get(sellerId).add(cart);
        }
        // return cartDAOImpl.getAllCartByCustomerId(id);
        return mp;
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
//    @PostMapping("api/customers/{id}/orders/add")
//    public Order makeOrder(@PathVariable Integer id, @RequestBody Object order) {
//        // todo
//    }

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
    
    @PostMapping("api/payment")
    public void makeOrder(@RequestBody Object payment) {
    	HashMap<String, List<Integer>> mp = (HashMap) payment;
    }

    @PostMapping("api/auth/register")
    public Customer register(@RequestBody Object customer) {
        HashMap<String, String> mp = (HashMap) customer;
        String username = mp.get("username");
        String password = mp.get("password");
        String firstName = mp.get("firstName");
        String lastName = mp.get("lastName");
        String phone = mp.get("phone");
        String email = mp.get("email");
        String dob = mp.get("dob");
        String image = mp.get("image") == null ? "https://i.imgur.com/3ZQZ9Zu.png" : mp.get("image");
        String role = "customer";
        
        User user = new User(phone, email, dob, image, role);
        User saved_user = userRepository.save(user);
        Fullname fullname = new Fullname(firstName, lastName, saved_user);
        Fullname saved_fullname = fullnameRepository.save(fullname);
        Account account = new Account(username, password, saved_user);
        Account saved_account = accountRepository.save(account);
        Customer save_customer = new Customer(saved_user, 0.0);
        return customerDAOImpl.register(save_customer);
    }
}
