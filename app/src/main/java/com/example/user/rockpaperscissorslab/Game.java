package com.example.user.rockpaperscissorslab;

public class Game {

    public static ResultType getResult(ChoiceType player_choice, ChoiceType android_choice) {
        switch(player_choice) {
            case ROCK:
                switch(android_choice) {
                    case SCISSORS: return ResultType.WIN;
                    case PAPER: return ResultType.LOSE;
                }
                break;
            case SCISSORS:
                switch(android_choice) {
                    case PAPER: return ResultType.WIN;
                    case ROCK: return ResultType.LOSE;
                }
                break;
            case PAPER:
                switch (android_choice) {
                    case SCISSORS: return ResultType.LOSE;
                    case ROCK: return ResultType.WIN;
                }
                break;
        }
        return ResultType.DRAW;
    }
}
