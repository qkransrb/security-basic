package com.example.security.controller;

import com.example.security.entity.Customer;
import com.example.security.repository.CustomerRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Optional;

@RestController
public class LoginController {

    private final CustomerRepository customerRepository;

    public LoginController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostMapping("/user")
    public Customer getUserDetailsAfterLogin(Principal user) {
        Optional<Customer> optional = customerRepository.findByEmail(user.getName());
        return optional.orElse(null);
    }
}
