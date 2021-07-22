package com.example.blogjpa.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.blogjpa.repository.UserRepository;
import com.example.blogjpa.service.UserService;

@SpringBootTest
class UserTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @BeforeEach
    void setup() {

        List<User> users = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            User user = new User("유저" + i);
            user.addComputer(new Computer("컴퓨터" + i));
            user.addComputer(new Computer("맥북" + i));

            users.add(user);
        }

        userRepository.saveAll(users);
    }

    @AfterEach
    void after() {
        userRepository.deleteAll();
    }

    @DisplayName("연관관계 확인")
    @Test
    void find() {
        List<String> computerNames = userService.findComputerNamesRepository();

        assertThat(computerNames.size()).isEqualTo(20);
    }

    @DisplayName("연관관계 확인 - join fetch")
    @Test
    void findJoinFetch() {
        List<String> computerNames = userService.findComputerNamesByJoinFetch();

        assertThat(computerNames.size()).isEqualTo(20);
    }

    @DisplayName("연관관계 확인 - entity graph")
    @Test
    void findEntityGraph() {
        List<String> computerNames = userService.findComputerNamesByEntityGraph();

        assertThat(computerNames.size()).isEqualTo(20);
    }

    @DisplayName("insert_time 확인")
    @Test
    void insertTime() {
        // given
        List<User> users = userRepository.findAll();
        // when
        // then
        User user = users.get(0);
        userService.updateName(user.getId(), "김메이어");

        User findUser = userRepository.findById(user.getId()).orElseThrow(RuntimeException::new);

        assertThat(findUser.getInsertTime()).isNotNull();
        assertThat(findUser.getUpdateTime()).isNotNull();
    }
}
