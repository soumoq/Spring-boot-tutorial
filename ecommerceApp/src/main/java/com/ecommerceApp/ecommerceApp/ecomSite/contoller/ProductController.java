package com.ecommerceApp.ecommerceApp.ecomSite.contoller;

import com.ecommerceApp.ecommerceApp.springBootWeb.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @GetMapping("/products")
    public String getProduct() {
        return "Hello";
    }
}
