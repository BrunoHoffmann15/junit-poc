package com.example.repository;

import com.example.model.Product;

public interface ProductRepository {
    Product findByName(String name);
}
