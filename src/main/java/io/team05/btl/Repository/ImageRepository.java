package io.team05.btl.Repository;

import io.team05.btl.Model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
