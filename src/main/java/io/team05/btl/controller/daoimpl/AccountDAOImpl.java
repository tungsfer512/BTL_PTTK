package io.team05.btl.controller.daoimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.*;
import io.team05.btl.model.*;
import io.team05.btl.repository.*;

@Service
public class AccountDAOImpl implements AccountDAO {
    @Autowired
    AccountRepository accountRepository;
    @Override
    public Account getAccountById(Integer id) {
        return accountRepository.findById(id).get();
    }
    
    @Override
    public boolean logIn(Account account) {
        Account existedAccount = accountRepository.getAccountByUsername(account.getUsername());
        if (existedAccount != null && existedAccount.getPassword().equals(account.getPassword())) {
            return true;
        }
        return false;
    }
}
