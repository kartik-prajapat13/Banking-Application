package com.example.BankingApplication.repository;

import com.example.BankingApplication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {




}
