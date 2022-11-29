package io.team05.btl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.team05.btl.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    
}
