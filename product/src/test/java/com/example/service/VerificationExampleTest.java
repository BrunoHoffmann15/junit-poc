package com.example.service;

import com.example.repository.ProductRepository;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class VerificationExampleTest {

    @Test
    void whenGetDiscountedPrice_thenRepositoryCalled() {
        ProductRepository repo = mock(ProductRepository.class);
        ProductService service = new ProductService(repo);

        try {
            service.getDiscountedPrice("Phone");
        } catch (Exception ignored) {}

        verify(repo).findByName("Phone");
        verify(repo, times(1)).findByName("Phone");
    }
}
