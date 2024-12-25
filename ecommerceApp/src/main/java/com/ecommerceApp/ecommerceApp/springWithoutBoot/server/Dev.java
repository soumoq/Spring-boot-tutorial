package com.ecommerceApp.ecommerceApp.springWithoutBoot.server;

public class Dev {
    int id;
    Computer computer;

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Dev(int id) {
        this.id = id;
    }

    public void build() {
        System.out.println(id + " Compute with " + computer.computer());
    }
}
