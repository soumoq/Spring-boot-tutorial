package com.ecommerceApp.ecommerceApp.ecomSite.service;

import com.ecommerceApp.ecommerceApp.ecomSite.model.Product;
import com.ecommerceApp.ecommerceApp.ecomSite.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product getProducts(int proId) {
        return productRepo.findById(proId).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
        return productRepo.save(product);
    }

    public String deleteProduct(int productId) {
        productRepo.deleteById(productId);
        return "Product deleted successful";
    }

    public void updateProduct(int productId, Product product, MultipartFile imageFile) throws IOException {
        if (productRepo.findById(productId).isPresent()) {
            product.setImageName(imageFile.getOriginalFilename());
            product.setImageType(imageFile.getContentType());
            product.setImageData(imageFile.getBytes());
            productRepo.save(product);
        }
    }

    public List<Product> searchProduct(String keyword) {
        return productRepo.findProduct(keyword);
    }
}
