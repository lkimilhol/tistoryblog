package com.example.blogjpa.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.blogjpa.repository.ComputerRepository;
import com.example.blogjpa.repository.UserRepository;
import com.example.blogjpa.service.UserService;

@SpringBootTest
class UserTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ComputerRepository computerRepository;

    @Autowired
    private UserService userService;

    private User user;

    @BeforeEach
    void setup() {
        List<Computer> computers = new ArrayList<>();

        user = new User("김메이어", computers);
        user.addComputer(new Computer("맥"));
        user.addComputer(new Computer("그램"));
        user.addComputer(new Computer("젠북"));

        userRepository.save(user);
    }

    @DisplayName("연관관계 확인")
    @Test
    void createEntity() {
        userService.printUserComputers();
    }
}
