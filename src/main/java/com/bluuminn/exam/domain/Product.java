package com.bluuminn.exam.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Long id;

    @Builder.Default
    private BigDecimal price = new BigDecimal(0);
}
