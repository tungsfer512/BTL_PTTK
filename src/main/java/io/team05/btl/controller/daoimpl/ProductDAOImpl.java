package io.team05.btl.controller.daoimpl;

import java.util.ArrayList;
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

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getAllProductByCategoryId(Integer id) {
        List<Integer> product_ids = productRepository.getAllProductIdByCategoryId(id);
        return productRepository.findAllById(product_ids);
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> getAllProductByShopId(Integer id) {
        return productRepository.getAllProductBySellerId(id);
    }

    @Override
    public Seller getShopByProductId(Integer id) {
        Product product = productRepository.findById(id).get();
        return product.getSeller();
    }

    @Override
    public List<Product> getAllProductByCategoryIdInShop(Integer categoryId, Integer shopId) {
        List<Product> products = getAllProductByCategoryId(categoryId);
        List<Product> productsInShop = new ArrayList<>();
        for (Product product : products) {
            if (product.getSeller().getId() == shopId) {
                productsInShop.add(product);
            }
        }
        return productsInShop;
    }
}
