package io.team05.btl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.team05.btl.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    @Query(value = "SELECT * FROM my_comment WHERE product_id=:product_id", nativeQuery = true)
    public List<Comment> getAllCommentByProductId(@Param("product_id") Integer product_id);
}
