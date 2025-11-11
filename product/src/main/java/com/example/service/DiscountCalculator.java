package com.example.service;

import com.example.model.Product;

public class DiscountCalculator {

    /**
     * Static method to apply a seasonal discount.
     * Normally it calculates 20% off.
     */
    public static double applySeasonalDiscount(Product product) {
        return product.getPrice() * 0.8;
    }
}