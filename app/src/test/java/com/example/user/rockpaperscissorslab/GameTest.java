package com.example.user.rockpaperscissorslab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void canDraw() {
        assertEquals(ResultType.DRAW, Game.play(ChoiceType.ROCK, ChoiceType.ROCK));
    }

}
