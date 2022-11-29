package io.team05.btl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.team05.btl.model.Image;

public interface ImageRepository extends JpaRepository<Image, Integer> {
}
