package com.example.blogjava.object;

import java.util.ArrayList;
import java.util.List;

class Cards {
    protected List<Integer> numbers;

    private Cards() {}

    public Cards(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public boolean isContain(int number) {
        return numbers.contains(number);
    }

    public void add(int number) {
        numbers.add(number);
    }
}

class Game {
    private Cards cards;

    private Game() {}

    public Game(Cards cards) {
        this.cards = cards;
    }

    public boolean play(int number) {
        return cards.isContain(number);
    }

    public void addAnswer(int number) {
        cards.add(number);
    }
}