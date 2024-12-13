package com.ecommerceApp.ecommerceApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Dev {
    @Autowired //Field injection
    @Qualifier("laptop")
    Computer compiler;

    public void build() {
        System.out.println("Building project");
        compiler.compiler();
    }
}
