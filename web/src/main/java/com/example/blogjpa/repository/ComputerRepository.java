package com.example.blogjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blogjpa.domain.Computer;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
}
