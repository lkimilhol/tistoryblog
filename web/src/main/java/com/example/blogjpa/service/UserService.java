package com.example.blogjpa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.blogjpa.domain.Computer;
import com.example.blogjpa.domain.User;
import com.example.blogjpa.repository.ComputerRepository;
import com.example.blogjpa.repository.UserRepository;

@Service
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;
    private final ComputerRepository computerRepository;

    public UserService(UserRepository userRepository, ComputerRepository computerRepository) {
        this.userRepository = userRepository;
        this.computerRepository = computerRepository;
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

    @Transactional
    public void updateName(Long userId, String name) {
        User user = userRepository.findById(userId).orElseThrow(RuntimeException::new);
        user.updateName(name);
    }

    public boolean testComputerName() {
        List<Computer> all = computerRepository.findAll();
        User user = new User("유저0");
        for (Computer computer : all) {
            if (computer.getUser().equals(user)) {
                return true;
            }
        }
        return false;
    }
}
