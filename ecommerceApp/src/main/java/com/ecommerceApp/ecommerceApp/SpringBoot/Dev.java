package com.ecommerceApp.ecommerceApp.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Dev {
    @Autowired //Field injection
    private final Computer compiler;

    public Dev(@Qualifier("laptop") Computer compiler){
        this.compiler = compiler;
    }

    public void build() {
        System.out.println("Building project");
        compiler.compiler();
    }
}
