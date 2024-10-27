package com.shopdevjava.springboot_hello.entity.feed;


import com.shopdevjava.springboot_hello.entity.user.UserEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "java_feed_001")
public class FeedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false,length = 255)
    private String title;

    @Column(nullable = false)
    @Lob
    private String description;

    @ManyToOne(cascade = CascadeType.ALL,optional = false)
    @JoinColumn(name = "userId",nullable = false) // foreign key
    private UserEntity user;
}
