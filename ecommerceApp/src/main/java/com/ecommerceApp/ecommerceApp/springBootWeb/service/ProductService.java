package com.ecommerceApp.ecommerceApp.springBootWeb.service;

import com.ecommerceApp.ecommerceApp.springBootWeb.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Java book", "500"),
            new Product(102, "C book", "520"),
            new Product(103, "C++ book", "5400")
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (id == product.getProId())
                return product;
        }
        throw new NullPointerException("The id not exist");
    }


    public String setProduct(Product product) {
        products.add(product);
        return "Product added";
    }
}
