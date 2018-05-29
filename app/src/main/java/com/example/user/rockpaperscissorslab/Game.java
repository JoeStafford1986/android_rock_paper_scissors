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
        }

        return ResultType.DRAW;
    }
}
