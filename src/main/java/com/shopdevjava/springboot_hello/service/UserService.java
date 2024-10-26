package com.shopdevjava.springboot_hello.service;

import com.shopdevjava.springboot_hello.entity.user.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {

    UserEntity createUser(UserEntity user);

    UserEntity findByUserNameAndUserEmail(String userName,String userEmail);

    // get all by limit offset
    Page<UserEntity> findAllUsers(Pageable pageable);

    // get search by limit offset
    Page<UserEntity> findByUserName(String userName, Pageable pageable);
}
