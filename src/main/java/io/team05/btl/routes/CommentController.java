package io.team05.btl.routes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.team05.btl.controller.daoimpl.CommentDAOImpl;
import io.team05.btl.model.Comment;

@RestController
@CrossOrigin
public class CommentController {
    @Autowired
    CommentDAOImpl commentDAOImpl;

    @GetMapping("api/comments/products/{id}")
    public List<Comment> getAllCommentByProduct(@PathVariable Integer id) {
        return commentDAOImpl.getAllCommentByProductId(id);
    }
    
    @GetMapping("api/comments/{id}")
    public Comment getCommentById(@PathVariable Integer id) {
        return commentDAOImpl.getCommentById(id);
    }

}
