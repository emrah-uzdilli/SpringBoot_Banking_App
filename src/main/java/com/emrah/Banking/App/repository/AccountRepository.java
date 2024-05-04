package com.emrah.Banking.App.repository;

import com.emrah.Banking.App.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
