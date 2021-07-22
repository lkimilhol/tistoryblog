package com.example.blogjpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Computer> computers = new ArrayList<>();

    public User() {}

    public User(String name, List<Computer> computers) {
        this.name = name;
        this.computers = computers;
    }

    public void addComputer(Computer computer) {
        computer.setUser(this);
        computers.add(computer);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Computer> getComputers() {
        return computers;
    }
}