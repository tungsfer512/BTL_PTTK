package io.team05.btl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.team05.btl.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query(value = "SELECT category_id FROM my_product_category WHERE product_id = :product_id", nativeQuery = true)
    public List<Integer> getAllCategoryIdByProductId(@Param("product_id") Integer product_id);
}
