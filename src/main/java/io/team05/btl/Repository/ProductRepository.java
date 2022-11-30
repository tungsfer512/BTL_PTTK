package io.team05.btl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.team05.btl.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query(value = "SELECT * FROM my_product_category WHERE category_id=:id", nativeQuery = true)
    List<Integer> getAllProductIdByCategoryId( @Param("id") Integer id);

    @Query(value = "SELECT * FROM my_product WHERE seller_id=:id", nativeQuery = true)
    List<Product> getAllProductBySellerId( @Param("id") Integer id);

}
