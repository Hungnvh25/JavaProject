package com.shopdevjava.springboot_hello.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "java_product_001")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private BigDecimal productPrice;

    // get

    // set

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "java_product_order_001",
            joinColumns = @JoinColumn(name = "productId"),
            inverseJoinColumns = @JoinColumn(name = "orderId")
    )
    private List<OrderEntity> orderList;
}
