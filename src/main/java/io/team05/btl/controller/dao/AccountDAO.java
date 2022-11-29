package io.team05.btl.controller.dao;

import io.team05.btl.model.Account;

public interface AccountDAO {
    public Account logIn(Account account);
    public Account register(Account account);
    public Account getAccountByUsername(String username);
}
