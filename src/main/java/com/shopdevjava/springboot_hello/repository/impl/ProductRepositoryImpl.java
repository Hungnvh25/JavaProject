package com.shopdevjava.springboot_hello.repository.impl;

import com.shopdevjava.springboot_hello.entity.ProductEntity;
import com.shopdevjava.springboot_hello.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public ProductEntity createProduct(ProductEntity product) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(1L);
        productEntity.setProductName("Hungai");
        productEntity.setProductPrice(new BigDecimal("21.6"));

        return productEntity;
    }

    @Override
    public List<ProductEntity> findAllProducts() {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(1L);
        productEntity.setProductName("Hungai");
        productEntity.setProductPrice(new BigDecimal("21.6"));
        return List.of(productEntity);
    }
}
