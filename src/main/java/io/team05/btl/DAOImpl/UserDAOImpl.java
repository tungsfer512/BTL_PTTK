package io.team05.btl.DAOImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.DAO.UserDAO;
import io.team05.btl.Model.*;
import io.team05.btl.Repository.*;

@Service
public class UserDAOImpl implements UserDAO {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ProductRepository productRepository;

    public Product addNewProduct(Product product, List<Image> images, List<ProductCategory> productCategories) {
        Product savedProduct = productRepository.save(product);
        return savedProduct;
    }
}
