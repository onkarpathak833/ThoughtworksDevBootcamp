package com.tdd.tw;

public class AlwaysCheatPlayer extends Player {

    AlwaysCheatPlayer(){
        super.playerMove = Move.CHEAT;
    }
    @Override
    void move() {
        super.playerMove = Move.CHEAT;
    }
}
