package io.team05.btl.routes;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.team05.btl.controller.daoimpl.AccountDAOImpl;
import io.team05.btl.model.*;

@RestController
@CrossOrigin
public class AccountController {
    @Autowired
    AccountDAOImpl accountDAOImpl;

    @GetMapping("/api/users/{id}")
    public Account getAccountById(@PathVariable Integer id) {
        return accountDAOImpl.getAccountById(id);
    }

    @PostMapping("/api/auth/login")
    public boolean logIn(@RequestBody Object account) {
        HashMap<String, String> req = (HashMap) account;
        Account acc = new Account(req.get("username"), req.get("password"));
        return accountDAOImpl.logIn(acc);
    }
}
