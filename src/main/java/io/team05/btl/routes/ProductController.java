package io.team05.btl.routes;

import io.team05.btl.controller.daoimpl.ImageDAOImpl;
import io.team05.btl.controller.daoimpl.ProductDAOImpl;
import io.team05.btl.model.Image;
import io.team05.btl.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ProductController {
    @Autowired
    ProductDAOImpl productDAOImpl;
    @Autowired
    ImageDAOImpl imageDAOImpl;

    @GetMapping("/api/images")
    public List<Image> getAllImage() {
        return imageDAOImpl.getAllImage();
    }
    @GetMapping("/api/products")
    public List<Product> getAllProduct() {
        return productDAOImpl.getAllProduct();
    }
}
