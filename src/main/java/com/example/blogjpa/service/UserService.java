package com.example.blogjpa.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.blogjpa.repository.UserRepository;

@Service
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void printUserComputers() {
        userRepository.findAll().forEach(user -> user.getComputers().forEach(
                computer -> System.out.println()
        ));
    }

}
