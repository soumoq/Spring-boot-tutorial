package com.ecommerceApp.ecommerceApp.springWithoutBoot;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dev {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Build build = (Build) context.getBean("build");
        build.building();


    }
}
