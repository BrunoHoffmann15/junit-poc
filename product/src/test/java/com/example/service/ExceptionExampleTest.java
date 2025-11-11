package com.example.service;

import com.example.repository.ProductRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class ExceptionExampleTest {

    @Test
    void givenProductNotFound_whenGetDiscountedPrice_thenThrowsException() {
        ProductRepository repo = mock(ProductRepository.class);
        when(repo.findByName("Unknown")).thenReturn(null);

        ProductService service = new ProductService(repo);
        assertThrows(IllegalArgumentException.class,
                     () -> service.getDiscountedPrice("Unknown"));
    }
}
