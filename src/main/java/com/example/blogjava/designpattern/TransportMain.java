package com.example.blogjava.designpattern;

public class TransportMain {
    public static void main(String[] args) {
        Bus bus = new Bus("버스", "자동차", "기름");
        System.out.println(bus.explain());

        Train train = new Train("지하철", "기차", "전기");
        System.out.println(train.explain());

        Taxi taxi = new Taxi("택시", "자동차", "기름");
        System.out.println(taxi.explain());
    }
}
