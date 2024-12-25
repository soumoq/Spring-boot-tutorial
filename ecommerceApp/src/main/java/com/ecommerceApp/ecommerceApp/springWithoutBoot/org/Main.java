package com.ecommerceApp.ecommerceApp.springWithoutBoot.org;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Emp emp = (Emp) context.getBean("emp");
        emp.toString();
    }
}
