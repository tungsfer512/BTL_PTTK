package io.team05.btl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.team05.btl.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
