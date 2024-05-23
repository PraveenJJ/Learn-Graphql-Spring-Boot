package com.learning.demo.controller;

import com.learning.demo.model.BankAccount;
import com.learning.demo.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
public class BankAccountController {

    @Autowired
    private BankAccountService service;

    @QueryMapping
    public BankAccount fetchBankAccount(@Argument UUID id) {
        return this.service.fetchBankAccount(id);
    }

}
