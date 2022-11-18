package io.team05.btl.Repository;

import io.team05.btl.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AccountRepository extends JpaRepository<Account, Long> {
}
