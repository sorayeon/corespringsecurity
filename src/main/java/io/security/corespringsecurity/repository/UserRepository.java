package io.security.corespringsecurity.repository;

import io.security.corespringsecurity.domin.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
}
