package io.team05.btl.routes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.team05.btl.controller.daoimpl.AdminDAOImpl;

@RestController
@CrossOrigin
public class AdminController {
    @Autowired
    AdminDAOImpl adminDAOImpl;

    @PostMapping("api/admins/users/{id}/delete")
    public void deleteUserById(@PathVariable Integer id) {
        System.out.println(id);
        adminDAOImpl.deleteUserById(id);
    }
}
