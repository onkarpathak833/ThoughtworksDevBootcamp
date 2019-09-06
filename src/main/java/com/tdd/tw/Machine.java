package com.tdd.tw;

import static com.tdd.tw.Move.CHEAT;
import static com.tdd.tw.Move.COOPERATE;

public class Machine {

    public Score calculateScore(Move move) {
        if(move.playerOneMove.equals(COOPERATE) && move.playerTwoMove.equals(COOPERATE)) {
            return new Score(2,2);
        }
        else if(move.playerOneMove.equals(CHEAT) && move.playerTwoMove.equals(CHEAT)) {
            return new Score(0,0);
        }
        else if(move.playerOneMove.equals(COOPERATE) && move.playerTwoMove.equals(CHEAT)) {
            return new Score (-1,3);
        }
        else if(move.playerOneMove.equals(CHEAT) && move.playerTwoMove.equals(COOPERATE)) {
            return  new Score (3,-1);
        }
        return new Score(0,0);
    }
}
