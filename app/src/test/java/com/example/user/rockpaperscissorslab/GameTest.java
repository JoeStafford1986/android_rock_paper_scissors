package com.example.user.rockpaperscissorslab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void canDraw() {
        assertEquals(ResultType.DRAW, Game.play(ChoiceType.ROCK, ChoiceType.ROCK));
    }

    @Test
    public void canWin(){
        assertEquals(ResultType.WIN, Game.play(ChoiceType.ROCK, ChoiceType.SCISSOR));
    }

}
