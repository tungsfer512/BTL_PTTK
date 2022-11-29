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

    @Override
    public void deleteUserById(Integer id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public User updateUserById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Category addCategory(Category category) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Category updateCategory(Category category) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deletecategoryById(Integer id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Seller> getAllSeller() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Customer> getAllCustomer() {
        // TODO Auto-generated method stub
        return null;
    }
}
