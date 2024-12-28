package com.ecommerceApp.ecommerceApp.ecomSite.contoller;

import com.ecommerceApp.ecommerceApp.ecomSite.model.Product;
import com.ecommerceApp.ecommerceApp.ecomSite.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }

    @GetMapping("/product/{proId}")
    public ResponseEntity<Product> getProduct(@PathVariable int proId) {
        Product product = productService.getProducts(proId);
        if (product != null)
            return new ResponseEntity<>(productService.getProducts(proId), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestBody Product product, @RequestPart MultipartFile imageFile) {
        System.out.println("SG_LOG" + product);
        try {
            return new ResponseEntity<Product>(productService.addProduct(product, imageFile), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
