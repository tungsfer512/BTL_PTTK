package io.team05.btl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.team05.btl.model.Shipment;

public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {
}
