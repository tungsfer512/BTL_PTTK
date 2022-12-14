package io.team05.btl.routes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.team05.btl.controller.daoimpl.FullnameDAOImpl;
import io.team05.btl.model.Fullname;

@RestController
@CrossOrigin
public class FullnameController {
    @Autowired
    FullnameDAOImpl fullnameDAOImpl;

    @GetMapping("/api/fullname/user/{id}")
    public Fullname getFullnameByUser(@PathVariable Integer id) {
        return fullnameDAOImpl.getFullnameByUserId(id);
    }
}
