package io.team05.btl.routes;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import io.team05.btl.controller.daoimpl.*;
import io.team05.btl.model.Product;
import io.team05.btl.model.Seller;

@RestController
@CrossOrigin
public class SellerController {
    @Autowired
    SellerDAOImpl sellerDaoImpl;
    @GetMapping("/api/shop/{shop_id}")
    public Seller getAllSellerById(@PathVariable Integer shop_id) {
        return sellerDaoImpl.getSellerById(shop_id);
    }
    
    @GetMapping("/api/shop/{shop_id}/category")
    public Seller getAllCategoryInShop(@PathVariable Integer id) {
        return sellerDaoImpl.getSellerById(id);
    }
}
