package com.example.security.repository;

import com.example.security.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Integer> {

    List<Card> findByCustomerId(int customerId);
}
