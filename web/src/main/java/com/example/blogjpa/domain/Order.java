package com.example.blogjpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;

@Entity
@Table(name = "orders")
public class Order extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedBy
    private String userName;

    public Order() {}

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    /*
    persist 전에 실행되는 로직, 테스트를 마치고 주석 처리

    @PrePersist
    public void setup() {
        this.userName = "test";
    }
     */
}
