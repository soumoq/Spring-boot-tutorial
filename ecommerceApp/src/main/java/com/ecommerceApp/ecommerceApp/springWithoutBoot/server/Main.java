package com.ecommerceApp.ecommerceApp.springWithoutBoot.server;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev dev = context.getBean(Dev.class);
        dev.build();

//       Dev dev = new Dev(199150);
//       dev.setComputer(new Desktop());
//       dev.build();
    }
}
