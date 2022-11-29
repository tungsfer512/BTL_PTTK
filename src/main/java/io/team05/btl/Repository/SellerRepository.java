package io.team05.btl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.team05.btl.model.Seller;

public interface SellerRepository extends JpaRepository<Seller, Integer> {
}
