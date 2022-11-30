package io.team05.btl.controller.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.CommentDAO;
import io.team05.btl.model.Comment;
import io.team05.btl.repository.CommentRepository;

@Service
public class CommentDAOImpl implements CommentDAO {
    @Autowired
    CommentRepository commentRepository;

    @Override
    public List<Comment> getAllCommentByProductId(Integer id) {
        return commentRepository.getAllCommentByProductId(id);
    }

    @Override
    public Comment getCommentById(Integer id) {
        return commentRepository.findById(id).get();
    }
    
}
