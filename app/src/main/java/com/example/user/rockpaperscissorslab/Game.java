package com.example.user.rockpaperscissorslab;

public class Game {

    public static ResultType play(ChoiceType player_choice, ChoiceType android_choice) {
        if (player_choice == android_choice) {
            return ResultType.DRAW;
        }


        return ResultType.WIN;
    }
}
