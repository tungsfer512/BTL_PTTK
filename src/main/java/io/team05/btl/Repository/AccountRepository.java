package io.team05.btl.Repository;

import io.team05.btl.Model.Account;
import io.team05.btl.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query(value = "Select * from user", nativeQuery = true)
    public List<User> getAllUser();
}
