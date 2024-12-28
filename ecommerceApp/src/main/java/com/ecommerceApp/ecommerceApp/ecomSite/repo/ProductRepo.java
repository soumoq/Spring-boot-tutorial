package com.ecommerceApp.ecommerceApp.ecomSite.repo;

import com.ecommerceApp.ecommerceApp.ecomSite.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
