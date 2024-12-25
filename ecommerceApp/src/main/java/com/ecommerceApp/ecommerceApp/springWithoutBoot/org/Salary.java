package com.ecommerceApp.ecommerceApp.springWithoutBoot.org;

public class Salary {
    private int amount;
    private Bank bank;

    public Salary(int amount, Bank bank) {
        this.amount = amount;
        this.bank = bank;
    }

    public int getAmount() {
        return amount;
    }

    public Bank getBank() {
        return bank;
    }
}
