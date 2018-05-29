package com.example.user.rockpaperscissorslab;

import java.util.Random;

public enum ChoiceType {
    ROCK,
    PAPER,
    SCISSOR;

    private static Random randomer = new Random();

    public static ChoiceType random() {
        ChoiceType[] values = values();
        return values[randomer.nextInt(values.length)];
    }
}
