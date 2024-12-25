package com.ecommerceApp.ecommerceApp.SpringBoot;

import com.ecommerceApp.ecommerceApp.springWithoutBoot.Build;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EcommerceAppApplication {

    public static void main(String[] args) {
            ConfigurableApplicationContext context = SpringApplication.run(EcommerceAppApplication.class, args);
        Dev dev = context.getBean(Dev.class);
        dev.build();

    }

}
