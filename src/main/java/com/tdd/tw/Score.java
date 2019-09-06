package com.tdd.tw;

public class Score {
    int playerOneScore;
    int playerTwoScore;

    Score(int playerOneScore, int playerTwoScore) {
        this.playerOneScore = playerOneScore;
        this.playerTwoScore = playerTwoScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score = (Score) o;
        return playerOneScore == score.playerOneScore &&
                playerTwoScore == score.playerTwoScore;
    }
}
