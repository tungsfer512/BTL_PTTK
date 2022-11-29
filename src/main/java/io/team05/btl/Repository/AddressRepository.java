package io.team05.btl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.team05.btl.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
