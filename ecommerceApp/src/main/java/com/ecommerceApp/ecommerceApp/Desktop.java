package com.ecommerceApp.ecommerceApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    @Override
    public void compiler() {
        System.out.println("Implement desktop compiler.");
    }
}
