package com.example.security.controller;

import com.example.security.entity.Customer;
import com.example.security.entity.Loan;
import com.example.security.repository.LoanRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanController {

    private final LoanRepository loanRepository;

    public LoanController(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    @PostMapping("/myLoans")
    public List<Loan> getLoanDetails(@RequestBody Customer customer) {
        return loanRepository.findByCustomerIdOrderByStartDtDesc(customer.getId());
    }
}
