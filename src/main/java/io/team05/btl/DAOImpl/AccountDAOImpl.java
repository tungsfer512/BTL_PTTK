package io.team05.btl.DAOImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.Repository.AccountRepository;

@Service
public class AccountDAOImpl {
    @Autowired
    AccountRepository accountRepository;
}
