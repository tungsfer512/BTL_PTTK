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
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> getAllCategoryByProductId(Integer id) {
        List<Integer> category_ids = categoryRepository.getAllCategoryIdByProductId(id);
        List<Category> res = categoryRepository.findAllById(category_ids);
        return res;
    }

    @Override
    public Category getCategoryById(Integer id) {
        return categoryRepository.findById(id).get();
    }

}
