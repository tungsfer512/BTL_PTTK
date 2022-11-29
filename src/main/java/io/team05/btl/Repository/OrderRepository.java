package io.team05.btl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.team05.btl.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
