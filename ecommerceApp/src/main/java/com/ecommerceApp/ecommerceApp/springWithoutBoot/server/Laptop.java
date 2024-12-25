package com.ecommerceApp.ecommerceApp.springWithoutBoot.server;

public class Laptop implements Computer{
    @Override
    public String computer() {
        return "laptop";
    }
}
