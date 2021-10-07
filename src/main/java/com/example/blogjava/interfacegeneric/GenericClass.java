package com.example.blogjava.interfacegeneric;

import java.util.HashSet;
import java.util.Set;

public class GenericClass<T> {

    public GenericClass() {}

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <E> Set<E> genericMethod(E e) {
        Set<E> set = new HashSet<>();
        set.add(e);
        return set;
    }
}
