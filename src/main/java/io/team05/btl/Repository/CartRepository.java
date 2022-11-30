package io.team05.btl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.team05.btl.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
    @Query(value = "SELECT * FROM my_cart WHERE customer_id = :customer_id", nativeQuery = true)
    public List<Cart> getAllCartByCustomerId(@Param("customer_id") Integer customer_id);
}
