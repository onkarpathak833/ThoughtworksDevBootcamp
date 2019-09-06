package com.tdd.tw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlwaysCooperatePlayerTest {
    Player player;

    @Before
    public void setup() {
        this.player = new AlwaysCooperatePlayer();
    }

    @Test
    public void shouldReturnCooperateMove() {
        Assert.assertEquals(Move.COOPERATE, player.getPlayerMove());
    }

    @Test
    public void shouldReturnScore() {
        Assert.assertEquals(0, player.getScore());
    }

    @Test
    public void shouldReturnUpdatedScore() {
        player.setScore(5);
        Assert.assertEquals(5, player.getScore());
    }

}
