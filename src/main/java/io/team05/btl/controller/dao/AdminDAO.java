package io.team05.btl.controller.dao;

import java.util.List;

import io.team05.btl.model.Category;
import io.team05.btl.model.Customer;
import io.team05.btl.model.Seller;
import io.team05.btl.model.User;

public interface AdminDAO {
    public void deleteUserById(Integer id);
    public User updateUserById(Integer id);
    public Category addCategory(Category category);
    public Category updateCategory(Category category);
    public void deletecategoryById(Integer id);
    public List<Seller> getAllSeller();
    public List<Customer> getAllCustomer();
}
