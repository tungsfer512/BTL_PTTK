package io.team05.btl.controller.daoimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.SellerDAO;
import io.team05.btl.model.Order;
import io.team05.btl.model.Product;
import io.team05.btl.model.Seller;
import io.team05.btl.model.Voucher;
import io.team05.btl.repository.*;

@Service
public class SellerDAOImpl implements SellerDAO {
    @Autowired
    SellerRepository sellerRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ImageRepository imageRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public Seller sellerRegister(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Seller getSellerById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Product addProduct(Product product) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Product updateProduct(Product product) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void deleteProductById(Integer id) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public Voucher addVoucher(Voucher voucher) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Voucher updateVoucher(Voucher voucher) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void deleteVoucherById(Integer id) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public Order updateOrder(Order order) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void viewStatistic() {
        // TODO Auto-generated method stub
        
    }

}
