package com.shopdevjava.springboot_hello;

import com.shopdevjava.springboot_hello.entity.OrderEntity;
import com.shopdevjava.springboot_hello.entity.ProductEntity;
import com.shopdevjava.springboot_hello.repository.OrderRepository;
import com.shopdevjava.springboot_hello.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class ProductOrderTest {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Test
    @Transactional
    @Rollback(false)
    void manyToManyInsertTest(){
        ProductEntity product1 = new ProductEntity();
        ProductEntity product2 = new ProductEntity();
        OrderEntity order1 = new OrderEntity();
        OrderEntity order2 = new OrderEntity();
        OrderEntity order3 = new OrderEntity();

        product1.setProductName("Product1");
        product1.setProductPrice(new BigDecimal("4.6"));

        product1.setProductName("Product2");
        product1.setProductPrice(new BigDecimal("2.2"));

        order1.setUserId(1);
        order2.setUserId(2);
        order3.setUserId(3);

        //List Order in Product
        product1.setOrderList(List.of(order1,order2));
        product2.setOrderList(List.of(order2,order3));


        orderRepository.save(order1);
        orderRepository.save(order2);
        orderRepository.save(order3);

        productRepository.save(product1);
        productRepository.save(product2);


    }

    @Test
    @Transactional
    void selectManyToManyTest(){
        ProductEntity product = productRepository.findById(1L).orElseThrow();
        System.out.println(product);
        System.out.println(product.getOrderList());
    }

}
