package com.ecommerceApp.ecommerceApp;

import org.apache.catalina.core.ApplicationContext;
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
