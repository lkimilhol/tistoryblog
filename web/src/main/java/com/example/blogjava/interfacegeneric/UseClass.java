package com.example.blogjava.interfacegeneric;

import java.util.ArrayList;
import java.util.List;

public class UseClass {
    public void exceptionExample() {
        List test = new ArrayList<>();
        test.add("a");
        test.add("b");
        test.add("c");

        int a = (Integer) test.get(0) / 1;
    }

    public void example() {
        List<String> test = new ArrayList<>();
        test.add("a");
        test.add("b");
        test.add("c");
//        int a = (Integer) test.get(0) / 1;
    }

    public String genericClassCreate() {
        GenericClass<String> genericClass = new GenericClass<>();
        genericClass.setData("data");
        return genericClass.getData();
    }
}
