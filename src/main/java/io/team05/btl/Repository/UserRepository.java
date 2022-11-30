package io.team05.btl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.team05.btl.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
