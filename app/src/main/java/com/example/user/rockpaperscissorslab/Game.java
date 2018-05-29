package com.example.user.rockpaperscissorslab;

import android.widget.Switch;

public class Game {

    public static ResultType play(ChoiceType player_choice, ChoiceType android_choice) {
        switch(player_choice) {
            case ROCK:
                switch(android_choice){
                    case SCISSOR: return ResultType.WIN;
                    case PAPER: return ResultType.LOSE;
                }
            case SCISSOR:
                switch(android_choice) {
                    case PAPER: return ResultType.WIN;
                    case ROCK: return ResultType.LOSE;
                }
            case PAPER:
                switch (android_choice){
                    case SCISSOR: return ResultType.LOSE;
                    case ROCK: return ResultType.WIN;
                }
        }
        return ResultType.DRAW;
    }
}
