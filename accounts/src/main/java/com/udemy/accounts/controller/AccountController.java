package com.udemy.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer ){

        Accounts accounts = accountRepository.findByCustomerId(customer.getCustomerId());

        if (accounts != null) {
            return accounts;
        }
        return null;
    }

}
