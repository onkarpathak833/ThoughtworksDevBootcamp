package com.tdd.tw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlwaysCheatPlayerTest {
    Player player;
    @Before
    public void shouldReturnAlwaysCheatPlayer() {
        this.player = new AlwaysCheatPlayer();
    }

    @Test
    public void shouldReturnCheatMove(){
        Assert.assertEquals(Move.CHEAT, player.getPlayerMove());
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

    @Test
    public void shouldAddAndUpdatedScore() {
        Player newPlayer = new AlwaysCheatPlayer();
        newPlayer.setScore(5);
        newPlayer.setScore(5);
        Assert.assertEquals(10, newPlayer.getScore());
    }
}
