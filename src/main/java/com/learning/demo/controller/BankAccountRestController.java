package com.learning.demo.controller;

import com.learning.demo.model.BankAccount;
import com.learning.demo.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/rest")
public class BankAccountRestController {

    @Autowired
    private BankAccountService service;

    @GetMapping("/bankAccount/{id}")
    public BankAccount fetchBankAccount(@PathVariable UUID id) {
        return this.service.fetchBankAccount(id);
    }

}
