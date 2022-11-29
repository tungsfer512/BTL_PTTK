package io.team05.btl.controller.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.CategoryDAO;
import io.team05.btl.model.Category;
import io.team05.btl.repository.*;

@Service
public class CategoryDAOImpl implements CategoryDAO {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategory() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Category> getAllCategoryByProductId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Category getCategoryById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

}
