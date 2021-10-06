package com.example.blogjava.interfacegeneric;

public class GenericImplements<T extends Number> implements GenericInterface<T> {
    @Override
    public int getSquared(T t) {
        return t.intValue() * t.intValue();
    }
}
