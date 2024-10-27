package com.shopdevjava.springboot_hello.repository;

import com.shopdevjava.springboot_hello.controller.user.CCCDEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CCCDRepository extends JpaRepository<CCCDEntity,Long> {
}
