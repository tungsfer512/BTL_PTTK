package io.team05.btl.routes;

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

    @PostMapping("/api/auth/register")
    public Object register(@RequestBody Object user) {
        // HashMap<String, String> mp = (HashMap) user;
        // Account a = new Account(mp.get("username"), mp.get("password"));
        // System.out.println(mp);
        return user;
    }

    @GetMapping("/api/users/{id}")
    public Account getAccountById(@PathVariable Integer id) {
        return accountDAOImpl.getAccountById(id);
    }
}
