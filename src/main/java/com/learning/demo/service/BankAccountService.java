package com.learning.demo.service;

import com.learning.demo.model.BankAccount;
import com.learning.demo.model.Currency;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BankAccountService {

    public BankAccount fetchBankAccount(UUID id) {
        return BankAccount.builder().id(id).currency(Currency.USD).name("Batman").build();
    }

}
