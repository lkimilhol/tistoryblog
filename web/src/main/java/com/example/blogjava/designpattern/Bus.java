package com.example.blogjava.designpattern;

public class Bus extends Transportation {
    Bus(String name, String type, String fuel) {
        this.name = name;
        this.type = type;
        this.fuel = fuel;
    }

    @Override
    public String explain() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("는(은) ");
        sb.append(type);
        sb.append("이며 ");
        sb.append(fuel);
        sb.append("로(으로) 움직입니다.");
        return sb.toString();
    }
}
