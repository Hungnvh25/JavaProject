package com.shopdevjava.springboot_hello.repository;

import com.shopdevjava.springboot_hello.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository {

    ProductEntity createProduct(ProductEntity product);
    List<ProductEntity> findAllProducts();

}
