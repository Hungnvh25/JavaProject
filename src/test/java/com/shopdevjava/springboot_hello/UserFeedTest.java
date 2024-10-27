package com.shopdevjava.springboot_hello;

import com.shopdevjava.springboot_hello.entity.feed.FeedEntity;
import com.shopdevjava.springboot_hello.entity.user.UserEntity;
import com.shopdevjava.springboot_hello.repository.FeedRepository;
import com.shopdevjava.springboot_hello.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
public class UserFeedTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FeedRepository feedRepository;

    @Test
    @Transactional
    @Rollback(false)
    void oneToManyTest(){
        UserEntity user = new UserEntity();
        FeedEntity feed = new FeedEntity();

        user.setUserName("Tipjava");
        user.setUserEmail("Tipjava@gmail.com");

        feed.setTitle("Feed 01");
        feed.setDescription("Akinawoa");

        user.setFeedList(List.of(feed));
        feed.setUser(user);

        userRepository.save(user);
    }

    @Test
    @Transactional
    @Rollback(false)
    void oneToManyTestTow(){
        UserEntity user = new UserEntity();
        FeedEntity feed = new FeedEntity();

        user.setUserName("Tip Hung");
        user.setUserEmail("Tipung@gmail.com");

        feed.setTitle("Feed 02");
        feed.setDescription("hihi");

        user.setFeedList(List.of(feed));
        feed.setUser(user);

        userRepository.save(user);
    }

    @Test
    @Transactional
    void selectOneToManyTest(){
        UserEntity user = userRepository.findById(11L).orElseThrow();
        System.out.println(user);
        System.out.println(user.getFeedList());
    }
}
