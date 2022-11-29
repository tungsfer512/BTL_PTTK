package io.team05.btl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.team05.btl.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
