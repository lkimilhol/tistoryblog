package com.example.blogjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.blogjpa.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select DISTINCT u from User u join fetch u.computers")
    List<User> findAllJoinFetch();

    @EntityGraph(attributePaths = "computers")
    @Query("select DISTINCT u from User u")
    List<User> findAllEntityGraph();
}
