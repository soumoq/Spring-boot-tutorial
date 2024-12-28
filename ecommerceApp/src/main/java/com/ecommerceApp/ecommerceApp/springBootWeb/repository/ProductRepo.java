package com.ecommerceApp.ecommerceApp.springBootWeb.repository;

import com.ecommerceApp.ecommerceApp.springBootWeb.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
