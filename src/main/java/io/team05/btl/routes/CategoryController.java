package io.team05.btl.routes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.team05.btl.controller.daoimpl.CategoryDAOImpl;
import io.team05.btl.model.Category;

@RestController
@CrossOrigin
public class CategoryController {
    @Autowired
    CategoryDAOImpl categoryDAOImpl;


    @GetMapping("/api/categories")
    public List<Category> getAllCategory() {
        return categoryDAOImpl.getAllCategory();
    }
    
    @GetMapping("/api/categories/product/{id}")
    public List<Category> getAllCategoryByProduct(@PathVariable Integer id) {
        return categoryDAOImpl.getAllCategoryByProductId(id);
    }

    @GetMapping("/api/categories/{id}")
    public Category getCategoryById(@PathVariable Integer id) {
        return categoryDAOImpl.getCategoryById(id);
    }


}
