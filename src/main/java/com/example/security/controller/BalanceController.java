package com.example.security.controller;

import com.example.security.entity.AccountTransaction;
import com.example.security.entity.Customer;
import com.example.security.repository.AccountTransactionRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BalanceController {

    private final AccountTransactionRepository accountTransactionRepository;

    public BalanceController(AccountTransactionRepository accountTransactionRepository) {
        this.accountTransactionRepository = accountTransactionRepository;
    }

    @PostMapping("/myBalance")
    public List<AccountTransaction> getBalanceDetails(@RequestBody Customer customer) {
        return accountTransactionRepository.findByCustomerIdOrderByTransactionDtDesc(customer.getId());
    }
}
