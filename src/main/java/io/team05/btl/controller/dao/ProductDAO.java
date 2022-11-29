package io.team05.btl.controller.dao;

import java.util.List;

import io.team05.btl.model.Product;
import io.team05.btl.model.Seller;

public interface ProductDAO {
    public List<Product> getAllProduct();
    public List<Product> getAllProductByCategoryId(Integer id);
    public Product getProductById(Integer id);
    public List<Product> getAllProductByShopId(Integer id);
    public Seller getShopByProductId(Integer id);
    public List<Product> getAllProductByCategoryIdInShop(Integer categoryId, Integer shopId);
}
