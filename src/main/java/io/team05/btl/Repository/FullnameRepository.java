package io.team05.btl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.team05.btl.model.Fullname;

public interface FullnameRepository extends JpaRepository<Fullname, Integer> {
    @Query(value = "SELECT * FROM my_fullname WHERE id=:id", nativeQuery = true)
    public Fullname getFullnameByUserId(@Param("id") Integer id);
}
