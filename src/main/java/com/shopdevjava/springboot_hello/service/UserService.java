package com.shopdevjava.springboot_hello.service;

import com.shopdevjava.springboot_hello.entity.user.UserEntity;

import java.util.List;

public interface UserService {

    UserEntity createUser(UserEntity user);
    List<UserEntity> getAllUsers();
}
