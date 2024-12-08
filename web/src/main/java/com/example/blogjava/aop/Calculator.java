package com.example.blogjava.aop;

public class Calculator {
    private int value;

    public Calculator(int value) {
        this.value = value;
    }

    public void add(int value) {
        this.value += value;
    }

    public void sub(int value) {
        this.value -= value;
    }

    public void mul(int value) {
        this.value *= value;
    }

    public int get() {
        return value;
    }
}
