package io.team05.btl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.team05.btl.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

    @Query(value = "SELECT * FROM my_account WHERE username=:username", nativeQuery = true)
    public Account getAccountByUsername(@Param("username") String username);
}
