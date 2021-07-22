package com.example.blogjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blogjpa.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
