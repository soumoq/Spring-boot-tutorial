package com.ecommerceApp.ecommerceApp.SpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/")
    public String great(){
        return "Hello world!";
    }
}
