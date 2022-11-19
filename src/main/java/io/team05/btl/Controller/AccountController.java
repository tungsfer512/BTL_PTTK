package io.team05.btl.Controller;

import io.team05.btl.Model.Account;
import io.team05.btl.Model.User;
import io.team05.btl.Repository.UserRepository;
import io.team05.btl.Service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class AccountController {

    @Autowired
    
    AccountService accountService;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public Account addAccount() {
        User user = new User();
        userRepository.save(user);
        Account account = new Account("tungbv", "123456", user);
        accountService.addAccount(account);
        return account;
    }
}
