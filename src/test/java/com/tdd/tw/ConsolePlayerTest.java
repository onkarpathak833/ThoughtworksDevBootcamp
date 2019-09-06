package com.tdd.tw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

public class ConsolePlayerTest {
    Player player;
    Scanner sc;

    @Before
    public void setup() {
        this.sc = new Scanner(Move.COOPERATE);
        this.player = new ConsolePlayer(sc);
    }

    @Test
    public void shouldReturnExpectedMove() {
        player.move();
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

    @Test
    public void shouldReturnExpectedPlayerMove() {
        Assert.assertEquals(null, this.player.getPlayerMove());
    }

    @Test
    public void shoudlSetExpectedPlayerMove() {
        this.player.move();
        Assert.assertEquals(Move.COOPERATE, player.getPlayerMove());
    }

}
