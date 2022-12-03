package io.team05.btl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.team05.btl.model.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {

}
