package com.shopdevjava.springboot_hello;


import com.shopdevjava.springboot_hello.controller.user.CCCDEntity;
import com.shopdevjava.springboot_hello.entity.feed.FeedEntity;
import com.shopdevjava.springboot_hello.entity.user.UserEntity;
import com.shopdevjava.springboot_hello.repository.CCCDRepository;
import com.shopdevjava.springboot_hello.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
public class UserCCCDTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CCCDRepository cccdRepository;


    @Test
    @Transactional
    @Rollback(false)
    void oneToOneTest(){
        UserEntity user = new UserEntity();
        CCCDEntity cccdEntity = new CCCDEntity();

        user.setUserName("tip cccd2");
        user.setUserEmail("tipcccd2@gmail.com");

        cccdEntity.setNumberCCCD("2222222");

        user.setCccd(cccdEntity);

        userRepository.save(user);
    }
}
