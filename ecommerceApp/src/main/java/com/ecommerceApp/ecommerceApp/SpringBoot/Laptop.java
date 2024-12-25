package com.ecommerceApp.ecommerceApp.SpringBoot;

import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop implements Computer {
    public void compiler() {
        System.out.println("Compiling hadoop project");
    }
}
