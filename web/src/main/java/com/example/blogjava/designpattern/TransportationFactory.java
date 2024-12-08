package com.example.blogjava.designpattern;

public class TransportationFactory extends Factory{

    @Override
    public Transportation createTransportation(String name) {
        switch (name) {
            case "버스":
                return new Bus(name, "자동차", "기름");
            case "지하철":
                return new Train(name, "기차", "전기");
            case "택시":
                return new Taxi(name, "자동차", "기름");
            default: throw new IllegalArgumentException();
        }
    }
}
