package com.shopdevjava.springboot_hello.repository;

import com.shopdevjava.springboot_hello.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {


}
