package com.udemy.cards.controller;

import java.util.List;

import com.udemy.cards.model.Cards;
import com.udemy.cards.model.Customer;
import com.udemy.cards.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @Autowired
    private CardsRepository cardsRepository;

    public CardsController() {

    }
    @PostMapping("/myCards")
    public List<Cards> getCardDetails(@RequestBody Customer customer) {
        System.out.println("saaaaa: "+this);
        List<Cards> cards = cardsRepository.findByCustomerId(customer.getCustomerId());
        if (cards != null) {
            return cards;
        } else {
            return null;
        }

    }

}
