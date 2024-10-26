package com.shopdevjava.springboot_hello.service.impl;

import com.shopdevjava.springboot_hello.entity.user.UserEntity;
import com.shopdevjava.springboot_hello.repository.UserRepository;
import com.shopdevjava.springboot_hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public UserEntity findByUserNameAndUserEmail(String name, String email) {
        return userRepository.findByUserNameAndUserEmail(name,email);
    }
}
