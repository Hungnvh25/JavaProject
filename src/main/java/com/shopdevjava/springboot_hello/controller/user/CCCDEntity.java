package com.shopdevjava.springboot_hello.controller.user;

import com.shopdevjava.springboot_hello.entity.user.UserEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "java_cccd_001")
public class CCCDEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numberCCCD;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "userId")
//    private UserEntity user;

}
