package com.example.blogjpa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.blogjpa.domain.Computer;
import com.example.blogjpa.domain.User;
import com.example.blogjpa.repository.UserRepository;

@Service
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<String> findComputerNamesRepository() {
        return findComputerNames(userRepository.findAll());
    }

    public List<String> findComputerNamesByJoinFetch() {
        return findComputerNames(userRepository.findAllJoinFetch());
    }

    public List<String> findComputerNamesByEntityGraph() {
        return findComputerNames(userRepository.findAllEntityGraph());
    }

    private List<String> findComputerNames(List<User> users) {
        List<String> computerNames = new ArrayList<>();

        for (User user : users) {
            computerNames.addAll(user.getComputers().stream()
                    .map(Computer::getName).collect(Collectors.toList())
            );
        }

        return computerNames;
    }
}
