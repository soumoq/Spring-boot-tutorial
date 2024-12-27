package com.ecommerceApp.ecommerceApp.springBootWeb.controller;

import com.ecommerceApp.ecommerceApp.springBootWeb.model.Product;
import com.ecommerceApp.ecommerceApp.springBootWeb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProduct(){
        return productService.getProducts();
    }

    @GetMapping("/products/{proId}")
    public Product getProductById(@PathVariable int proId){
        return productService.getProductById(proId);
    }

    @PostMapping("/products")
    public String addProduct(@RequestBody Product product){
        return productService.setProduct(product);
    }
}
