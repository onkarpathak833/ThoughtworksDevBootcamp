package com.tdd.tw;

public class Move {
    public static final String COOPERATE = "co";
    public static final String CHEAT = "ch";

    String playerOneMove;
    String playerTwoMove;

    Move(String playerOneMove, String playerTwoMove) {
        this.playerOneMove = playerOneMove;
        this.playerTwoMove = playerTwoMove;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Move move = (Move) o;
        return playerOneMove == move.playerOneMove &&
                playerTwoMove == move.playerTwoMove;
    }
}
