package com.example.blogjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blogjpa.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
