package io.team05.btl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.team05.btl.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    @Query(value = "SELECT * FROM my_order WHERE customer_id=:customer_id", nativeQuery = true)
    public List<Order> getAllOrderByCustomerId(@Param("customer_id") Integer customer_id);
    
    @Query(value = "SELECT * FROM my_order WHERE product_id=:product_id", nativeQuery = true)
    public List<Order> getAllOrderByProductId(@Param("product_id") Integer product_id);

}
