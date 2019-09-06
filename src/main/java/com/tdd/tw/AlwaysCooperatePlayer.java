package com.tdd.tw;

public class AlwaysCooperatePlayer extends Player {

    AlwaysCooperatePlayer(String input) {
        super.playerMove = input;
    }

    void move() {
        super.playerMove = Move.COOPERATE;
    }
}
