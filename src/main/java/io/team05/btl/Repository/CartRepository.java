package io.team05.btl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.team05.btl.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
