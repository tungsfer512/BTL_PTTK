package io.team05.btl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.team05.btl.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
