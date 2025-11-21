package org.lint.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Wallet {
    private String color;
    private String size;
    private double amount;
    private Status status;

}
