package com.tdd.tw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import static com.tdd.tw.Move.COOPERATE;
import static org.mockito.Mockito.mock;

public class GameTest {
    private Game game;
    private Machine machine;
    private Player consolePlayer1;
    private Player consolePlayer2;

    @Before
    public void setup() {

        consolePlayer1 = mock(ConsolePlayer.class);
        consolePlayer2 = mock(ConsolePlayer.class);
        machine = mock(Machine.class);
        this.game = new Game(consolePlayer1, consolePlayer2,machine);
    }

    @Test
    public void shouldReturnExpectedMoveForGame() {
        Mockito.when(consolePlayer1.getPlayerMove()).thenReturn(COOPERATE);
        Mockito.when(consolePlayer2.getPlayerMove()).thenReturn(COOPERATE);
        Assert.assertEquals(new Move(COOPERATE, COOPERATE), game.move());
    }

    @Test
    public  void shouldReturnExpectedScoreForGame(){

        Move expectedMove = new Move("ch","ch");
        Mockito.when(consolePlayer1.getPlayerMove()).thenReturn(COOPERATE);
        Mockito.when(consolePlayer2.getPlayerMove()).thenReturn(COOPERATE);
        Mockito.when(machine.calculateScore(ArgumentMatchers.any())).thenReturn(new Score(2,2));
        Assert.assertEquals(new Score(2,2),game.calculateScore(expectedMove));

    }
}
