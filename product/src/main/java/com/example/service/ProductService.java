package com.example.service;

import com.example.model.Product;
import com.example.repository.ProductRepository;

public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public double getDiscountedPrice(String name) {
        Product p = repository.findByName(name);
        if (p == null) {
            throw new IllegalArgumentException("Product not found");
        }
        return p.getPrice() * 0.9;
    }
}
