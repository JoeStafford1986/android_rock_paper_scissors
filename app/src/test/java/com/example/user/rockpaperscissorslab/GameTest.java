package com.example.user.rockpaperscissorslab;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void canDrawWithRock() {
        assertEquals(ResultType.DRAW, Game.getResult(ChoiceType.ROCK, ChoiceType.ROCK));
    }

    @Test
    public void canWinWithRock() {
        assertEquals(ResultType.WIN, Game.getResult(ChoiceType.ROCK, ChoiceType.SCISSOR));
    }

    @Test
    public void canLoseWithRock() {
        assertEquals(ResultType.LOSE, Game.getResult(ChoiceType.ROCK, ChoiceType.PAPER));
    }

    @Test
    public void canDrawWithPaper() {
        assertEquals(ResultType.DRAW, Game.getResult(ChoiceType.PAPER, ChoiceType.PAPER));
    }

    @Test
    public void canWinWithPaper() {
        assertEquals(ResultType.WIN, Game.getResult(ChoiceType.PAPER, ChoiceType.ROCK));
    }

    @Test
    public void canLoseWithPaper() {
        assertEquals(ResultType.LOSE, Game.getResult(ChoiceType.PAPER, ChoiceType.SCISSOR));
    }

    @Test
    public void canDrawWithScissor() {
        assertEquals(ResultType.DRAW, Game.getResult(ChoiceType.SCISSOR, ChoiceType.SCISSOR));
    }

    @Test
    public void canWinWithScissor() {
        assertEquals(ResultType.WIN, Game.getResult(ChoiceType.SCISSOR, ChoiceType.PAPER));
    }

    @Test
    public void canLoseWithScissor() {
        assertEquals(ResultType.LOSE, Game.getResult(ChoiceType.SCISSOR, ChoiceType.ROCK));
    }



}
