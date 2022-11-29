package io.team05.btl.controller.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.ProductDAO;
import io.team05.btl.model.*;
import io.team05.btl.repository.*;

@Service
public class ProductDAOImpl implements ProductDAO {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getAllProductByCategoryId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product getProductById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> getAllProductByShopId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Seller getShopByProductId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> getAllProductByCategoryIdInShop(Integer categoryId, Integer shopId) {
        // TODO Auto-generated method stub
        return null;
    }
}
