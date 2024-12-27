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
        for (Product product : products)
            if (id == product.getProId())
                return product;
        throw new NullPointerException("The id not exist");
    }


    public String setProduct(Product product) {
        products.add(product);
        return "Product added";
    }

    public String updateProduct(Product pro) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProId() == pro.getProId()) {
                products.set(i, pro);
                return "Data updated";
            }
        }
        return "Id not found";
    }

    public String deleteProduct(int proid) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProId() == proid) {
                products.remove(i);
                return "Data deletd";
            }
        }
        return "id not found";
    }
}
