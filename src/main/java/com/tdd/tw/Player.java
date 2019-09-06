package com.tdd.tw;

abstract class Player {

    String playerMove;

    private int playerScore;

    abstract void move();

    public String getPlayerMove() {
        return this.playerMove;
    }

    public void setScore(int score) {
        this.playerScore += score;
    }

    public int getScore() {
        return this.playerScore;
    }
}