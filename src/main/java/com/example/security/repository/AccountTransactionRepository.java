package com.example.security.repository;

import com.example.security.entity.AccountTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, String> {

    List<AccountTransaction> findByCustomerIdOrderByTransactionDtDesc(int customerId);
}
