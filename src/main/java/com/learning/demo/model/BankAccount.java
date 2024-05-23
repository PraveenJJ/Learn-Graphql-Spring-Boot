package com.learning.demo.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class BankAccount {

    private UUID id;
    private String name;
    private Currency currency;

}
