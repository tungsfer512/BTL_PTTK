package io.team05.btl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.team05.btl.model.Image;

public interface ImageRepository extends JpaRepository<Image, Integer> {

    @Query(value = "SELECT * FROM my_image WHERE product_id=:product_id", nativeQuery = true)
    public List<Image> getAllImageByProductId(@Param("product_id") Integer product_id);
}
