package com.ecommerceApp.ecommerceApp.SpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("desktop")
@Primary
public class Desktop implements Computer {
    @Override
    public void compiler() {
        System.out.println("Implement desktop compiler.");
    }
}
