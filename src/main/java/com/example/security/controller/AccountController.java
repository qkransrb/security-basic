package com.example.security.controller;

import com.example.security.entity.Account;
import com.example.security.entity.Customer;
import com.example.security.repository.AccountRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class AccountController {

    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping("/myAccount")
    public Account getAccountDetails(@RequestBody Customer customer) {
        Optional<Account> optional = accountRepository.findByCustomerId(customer.getId());
        return optional.orElse(null);
    }
}
