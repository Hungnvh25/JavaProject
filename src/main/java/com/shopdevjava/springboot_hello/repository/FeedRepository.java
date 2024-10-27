package com.shopdevjava.springboot_hello.repository;

import com.shopdevjava.springboot_hello.entity.feed.FeedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedRepository extends JpaRepository<FeedEntity,Long> {


}
