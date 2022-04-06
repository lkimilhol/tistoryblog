package com.example.blogjava.designpattern;

public class TransportationMain {
    public static void main(String[] args) {
        Factory factory = new TransportationFactory();
        Transportation taxi = factory.createTransportation("택시");
        System.out.println(taxi.explain());
    }
}
