package com.example.service;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class StubExampleTest {

    @Test
    void givenStubbedRepository_whenGetDiscountedPrice_thenCorrectValue() {
        ProductRepository repo = mock(ProductRepository.class);
        when(repo.findByName("Laptop")).thenReturn(new Product("Laptop", 1000.0));

        ProductService service = new ProductService(repo);
        double price = service.getDiscountedPrice("Laptop");

        assertEquals(900.0, price);
    }
}
