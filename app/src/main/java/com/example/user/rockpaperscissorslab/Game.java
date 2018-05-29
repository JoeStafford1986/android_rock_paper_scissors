package com.example.user.rockpaperscissorslab;

import android.widget.Switch;

public class Game {

    public static ResultType play(ChoiceType player_choice, ChoiceType android_choice) {
        if (player_choice == android_choice) {
            return ResultType.DRAW;
        }
        switch(player_choice) {
            case ROCK:
                switch(android_choice){
                    case SCISSOR: return ResultType.WIN;
                    case PAPER: return ResultType.LOSE;
                }
        }


        return ResultType.WIN;
    }
}
