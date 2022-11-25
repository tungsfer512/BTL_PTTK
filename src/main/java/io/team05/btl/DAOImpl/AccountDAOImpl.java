package io.team05.btl.Service;

import io.team05.btl.DAOImpl.AccountDAOImpl;
import io.team05.btl.Model.*;
import io.team05.btl.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;;

@Service
public class AccountService {
    @Autowired
    AccountDAOImpl accountDAOImpl;

//    public Account addAccount(Account account) {
//        return accountDAOImpl.save(account);
//    }

//    public void deleteAccountById(Long id) {
//        accountRepository.deleteById(id);
//    }
//
//    public Account updateAccount(Account account) {
//        return accountRepository.findById(account.getId()).map(existedAccount -> {
//            existedAccount.setPassword(account.getPassword());
//            return accountRepository.save(existedAccount);
//        }).orElseGet(() -> {
//            return accountRepository.save(account);
//        });
//    }
//
//    public Account getAccountById( Long id) {
//        return accountRepository.findById(id).get();
//    }
//
//    public List<Account> getAllAccount() {
//        return accountRepository.findAll();
//    }
}
