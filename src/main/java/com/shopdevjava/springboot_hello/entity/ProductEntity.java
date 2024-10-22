package com.shopdevjava.springboot_hello.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductEntity {

    private Long id;
    private String productName;
    private BigDecimal productPrice;

    // get

    // set
}
