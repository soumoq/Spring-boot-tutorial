package com.ecommerceApp.ecommerceApp.springBootWeb.service;

import com.ecommerceApp.ecommerceApp.springBootWeb.model.Product;
import com.ecommerceApp.ecommerceApp.springBootWeb.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

//    private final List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Java book", "500"),
//            new Product(102, "C book", "520"),
//            new Product(103, "C++ book", "5400")
//    ));
    @Autowired
    ProductRepo productRepo;

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(int id) {
       return productRepo.findById(id).orElse(new Product());

    }


    public String setProduct(Product product) {
        productRepo.save(product);
        return "Product added";
    }

    public String updateProduct(Product pro) {
        productRepo.save(pro);
        return "product updated";
    }

    public String deleteProduct(int proid) {
        productRepo.deleteById(proid);
        return "product deleted";
    }
}
