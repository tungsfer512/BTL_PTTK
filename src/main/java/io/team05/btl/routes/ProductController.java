package io.team05.btl.routes;

import io.team05.btl.controller.daoimpl.ImageDAOImpl;
import io.team05.btl.controller.daoimpl.ProductDAOImpl;
import io.team05.btl.model.Image;
import io.team05.btl.model.Product;
import io.team05.btl.model.Seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ProductController {
    @Autowired
    ProductDAOImpl productDAOImpl;
    @Autowired
    ImageDAOImpl imageDAOImpl;

    @GetMapping("/api/products/{id}/images")
    public List<Image> getAllImageByProduct(@PathVariable Integer id) {
        return imageDAOImpl.getAllImageByProductId(id);
    }
    @GetMapping("/api/products")
    public List<Product> getAllProduct() {
        return productDAOImpl.getAllProduct();
    }
    
    @GetMapping("/api/products/category/{id}")
    public List<Product> getAllProductByCategory(@PathVariable Integer id) {
        return productDAOImpl.getAllProductByCategoryId(id);
    }
    
    @GetMapping("/api/products/shop/{id}")
    public List<Product> getAllProductByShop(@PathVariable Integer id) {
        return productDAOImpl.getAllProductByShopId(id);
    }
    
    @GetMapping("/api/products/shop/{shop_id}/category/{category_id}")
    public List<Product> getAllProductByCategoryInShop(@PathVariable Integer shop_id, @PathVariable Integer category_id) {
        return productDAOImpl.getAllProductByCategoryIdInShop(category_id, shop_id);
    }

    @GetMapping("/api/products/{id}/shop")
    public Seller getShopByProduct(@PathVariable Integer id) {
        return productDAOImpl.getShopByProductId(id);
    }
    
    @GetMapping("/api/products/{id}")
    public Product getProductById(@PathVariable Integer id) {
        return productDAOImpl.getProductById(id);
    }
}
