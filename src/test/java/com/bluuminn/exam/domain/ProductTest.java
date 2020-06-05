package com.bluuminn.exam.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class ProductTest {

    private Product product;

    @BeforeEach
    public void setUp() {
        product = Product.builder()
                .id(1L)
                .price(BigDecimal.valueOf(300))
                .build();
    }

    @Test
    public void checkBigDecimal() {
        assertThat(product.getPrice()).isEqualTo(BigDecimal.valueOf(0));
    }
}