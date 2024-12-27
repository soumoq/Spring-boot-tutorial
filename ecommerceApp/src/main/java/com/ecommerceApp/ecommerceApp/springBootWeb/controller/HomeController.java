package com.ecommerceApp.ecommerceApp.springBootWeb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet() {
        return "Hello world;";
    }

    @RequestMapping("/about")
    public String about(){
        return "I am soumo";
    }
}
