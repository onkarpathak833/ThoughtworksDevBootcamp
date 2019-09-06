package com.tdd.tw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MachineTest {
    Machine machine;
    @Before
    public void setup() {
        this.machine = new Machine();
    }


    @Test
    public void shouldReturnReturn2IfBothPlayerCooperate() {
        assertEquals(new Score(2,2), machine.calculateScore(new Move("co","co")));
    }

    @Test
    public void shouldReturn0IfBothPlayersCheat() {
        assertEquals(new Score(0,0), machine.calculateScore(new Move("ch","ch")));
    }

    @Test
    public void shouldReturnMinusOneAndThreeIfPlayer1CooperatesAndPlayerTwoCheats() {
        assertEquals(new Score(-1,3),machine.calculateScore(new Move("co","ch")));
    }

    @Test
    public void shouldReturnThreeAndMinusOneIfPlayer1CheatsAndPlayerTwoCooperates() {
        assertEquals(new Score(3,-1), machine.calculateScore(new Move("ch","co")));
    }
}
