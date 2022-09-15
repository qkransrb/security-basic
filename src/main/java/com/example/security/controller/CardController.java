package com.example.security.controller;

import com.example.security.entity.Card;
import com.example.security.entity.Customer;
import com.example.security.repository.CardRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {

    private final CardRepository cardRepository;

    public CardController(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @PostMapping("/myCards")
    public List<Card> getCardDetails(@RequestBody Customer customer) {
        return cardRepository.findByCustomerId(customer.getId());
    }
}
