package com.shopdevjava.springboot_hello.controller.user;

import com.shopdevjava.springboot_hello.entity.user.UserEntity;
import com.shopdevjava.springboot_hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
// localhost://8080/user
public class UserCURDController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public UserEntity addUser(@RequestBody UserEntity userEntity){
        return userService.createUser(userEntity);
    }

    @GetMapping("/search")
    public UserEntity searchUser(@RequestParam String name,@RequestParam String email){
        return userService.findByUserNameAndUserEmail(name,email);
    }
}
