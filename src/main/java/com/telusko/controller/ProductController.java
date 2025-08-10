package com.telusko.controller;

import com.telusko.model.Product;
import com.telusko.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Optional<Product> getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }


    @PostMapping("/products")
    public Product addProduct(@RequestBody Product prod) {
        return service.addProduct(prod);
    }
}
