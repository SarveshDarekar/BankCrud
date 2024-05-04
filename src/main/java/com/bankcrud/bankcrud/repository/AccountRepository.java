package com.bankcrud.bankcrud.repository;

import com.bankcrud.bankcrud.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {

}
