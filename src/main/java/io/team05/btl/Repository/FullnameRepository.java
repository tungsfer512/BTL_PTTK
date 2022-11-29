package io.team05.btl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.team05.btl.model.Fullname;

public interface FullnameRepository extends JpaRepository<Fullname, Integer> {
}
