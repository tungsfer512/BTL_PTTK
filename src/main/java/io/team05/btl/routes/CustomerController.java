package io.team05.btl.routes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.team05.btl.controller.daoimpl.CartDAOImpl;
import io.team05.btl.controller.daoimpl.CustomerDAOImpl;
import io.team05.btl.controller.daoimpl.OrderDAOImpl;
import io.team05.btl.controller.daoimpl.PaymentDAOImpl;
import io.team05.btl.controller.daoimpl.ProductDAOImpl;
import io.team05.btl.controller.daoimpl.ShipmentDAOImpl;
import io.team05.btl.model.Cart;
import io.team05.btl.model.Customer;
import io.team05.btl.model.Order;
import io.team05.btl.model.OrderDetail;
import io.team05.btl.model.Payment;
import io.team05.btl.model.Product;
import io.team05.btl.model.Shipment;
import io.team05.btl.repository.ProductRepository;

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
    OrderDAOImpl orderDAOImpl;
    @Autowired
    ShipmentDAOImpl shipmentDAOImpl;

    @Autowired
    ProductRepository productRepository;

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
   @PostMapping("api/customers/{id}/orders/add")
   public Order makeOrder(@PathVariable Integer id, @RequestBody Object order) {
        HashMap<String, String> map = (HashMap) order;
        Customer customer = customerDAOImpl.getCustomerById(id);
        Payment payment = paymentDAOImpl.getPaymentById(Integer.parseInt(map.get("payment_id")));
        Shipment shipment = payment.getShipment();
        Double amount = payment.getAmount() + shipment.getCost();

        Order orderNew = new Order(amount, "pending", customer, payment);
        customerDAOImpl.makeOrder(orderNew);
        String listcartId = map.get("listcartId");
        String[] listCardIdStr = listcartId.split(",");
        List<Integer> listCardIds = new ArrayList<>();
        for (String  i : listCardIdStr) {
            listCardIds.add((Integer.parseInt(i)));
        }
        for (Integer i : listCardIds) {
            Cart cart = cartDAOImpl.getCartById(i);
            Product product = cart.getProduct();
            int quantity = cart.getQuantity();
            OrderDetail orderDetail = new OrderDetail(quantity, orderNew, product);
            //them order detail
            orderDAOImpl.addOrderDetail(orderDetail);
            // xoa cart
            customerDAOImpl.deleteCartById(i);
            // thay doi
            product.setQuantity(product.getQuantity()-cart.getQuantity());
            productRepository.save(product);
        }
       return orderNew;
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
    
    @PostMapping("api/payment")
    public void makeOrder(@RequestBody Object payment) {
    	HashMap<String, List<Integer>> mp = (HashMap) payment;
    }

    
}
