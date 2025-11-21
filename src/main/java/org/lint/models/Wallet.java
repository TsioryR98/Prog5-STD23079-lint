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

    public void checkWalletOpen() {
        if(this.status != Status.OPEN){
            throw new IllegalStateException("Wallet is closed");
        }
    }
    public void open() {
        this.status = Status.OPEN;
    }

    public void close() {
        this.status = Status.CLOSED;
    }

    public double addVola(double vola) {
        checkWalletOpen();
        if(vola < 0){
            throw new IllegalArgumentException("Cannot add negative amount");
        }
        this.amount += vola;
        return this.amount;
    }
    public double getVola(double vola) {
        if (this.amount >= vola) {
            this.amount -= vola;
        } else {
            vola = this.amount;
            this.amount = 0;
        }
        return vola;
    }
    public double checkVola() {
        checkWalletOpen();
        return this.amount;
    }
}
