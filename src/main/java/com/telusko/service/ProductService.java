package com.telusko.service;

import com.telusko.Repo.ProductRepo;
import com.telusko.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Optional<Product> getProductById(int prodId) {
        return repo.findById(prodId);
    }
    public Product addProduct( Product prod) {
        return repo.save(prod);
    }
}
