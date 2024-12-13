package com.ecommerceApp.ecommerceApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compiler() {
        System.out.println("Compiling hadoop project");
    }
}
