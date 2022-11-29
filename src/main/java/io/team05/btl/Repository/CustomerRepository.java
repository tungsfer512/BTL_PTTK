package io.team05.btl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.team05.btl.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
