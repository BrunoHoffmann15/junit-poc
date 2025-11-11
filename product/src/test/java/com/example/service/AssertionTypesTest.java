package com.example.service;

import com.example.model.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AssertionTypesTest {

    @Test
    void testVariousAssertions() {
        Product p = new Product("TV", 1500.0);

        assertEquals("TV", p.getName());
        assertTrue(p.getPrice() > 1000);
        assertNull(null);
        assertThrows(ArithmeticException.class, () -> {
            int x = 1 / 0;
        });
    }
}