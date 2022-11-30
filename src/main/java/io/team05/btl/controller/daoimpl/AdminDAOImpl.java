package io.team05.btl.controller.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.AdminDAO;
import io.team05.btl.model.Category;
import io.team05.btl.model.Customer;
import io.team05.btl.model.Seller;
import io.team05.btl.model.User;
import io.team05.btl.repository.*;

@Service
public class AdminDAOImpl implements AdminDAO {
    @Autowired
    AdminRepository adminRepository;
    @Autowired
    SellerRepository sellerRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUserById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deletecategoryById(Integer id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public List<Seller> getAllSeller() {
        return sellerRepository.findAll();
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }
}
