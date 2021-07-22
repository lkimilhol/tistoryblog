package com.example.blogjpa.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.blogjpa.repository.OrderRepository;

@SpringBootTest
class OrderTest {

    @Autowired
    private OrderRepository orderRepository;

    @DisplayName("주문자 테스트")
    @Test
    void create() {
        // given
        Order order = new Order();
        // when
        orderRepository.save(order);
        // then
        assertThat(order).isNotNull();
        assertThat(order.getUserName()).isEqualTo("주문자");
    }
}