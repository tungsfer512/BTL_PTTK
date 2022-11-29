package io.team05.btl.controller.dao;

import java.util.List;

import io.team05.btl.model.Category;

public interface CategoryDAO {
    public List<Category> getAllCategory();
    public List<Category> getAllCategoryByProductId(Integer id);
    public Category getCategoryById(Integer id);
}
