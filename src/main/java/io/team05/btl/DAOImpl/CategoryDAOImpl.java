package io.team05.btl.DAOImpl;

import io.team05.btl.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryDAOImpl {
    @Autowired
    CategoryRepository categoryRepository;

}
