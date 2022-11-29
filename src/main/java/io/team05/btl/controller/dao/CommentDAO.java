package io.team05.btl.controller.dao;

import java.util.List;

import io.team05.btl.model.Comment;

public interface CommentDAO {
    List<Comment> getAllCommentByProductId(Integer id);
    public Comment getCommentById(Integer id);
}
