package io.team05.btl.controller.dao;

import io.team05.btl.model.Account;

public interface AccountDAO {
    public Account getAccountById(Integer id);
    
    public boolean logIn(Account account);

}
