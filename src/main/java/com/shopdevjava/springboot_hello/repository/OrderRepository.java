package com.shopdevjava.springboot_hello.repository;

import com.shopdevjava.springboot_hello.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity,Long> {
}
