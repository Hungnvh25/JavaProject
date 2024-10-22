package com.shopdevjava.springboot_hello.service;

import com.shopdevjava.springboot_hello.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    ProductEntity createProduct(ProductEntity product);
    List<ProductEntity> findAllProducts();
}
