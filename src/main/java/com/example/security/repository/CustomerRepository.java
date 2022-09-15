package com.example.security.repository;

import com.example.security.entity.Customer;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @EntityGraph(attributePaths = "authorities")
    Optional<Customer> findByEmail(String email);
}
