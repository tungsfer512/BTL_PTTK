package io.team05.btl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.team05.btl.model.Customer;
import io.team05.btl.model.Product;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "SELECT * FROM my_product WHERE description LIKE %:keyword% OR title LIKE %:keyword%", nativeQuery = true)
    public List<Product> searchInAll(@Param("keyword") String keyword);

    @Query(value = "SELECT * FROM my_product WHERE (description LIKE %:keyword% OR title LIKE %:keyword%) AND seller_id=:seller_id", nativeQuery = true)
    public List<Product> searchInShop(@Param("keyword") String keyword, @Param("seller_id") Integer seller_id);
}
