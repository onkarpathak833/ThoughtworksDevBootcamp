package com.tdd.tw;

import java.util.Scanner;

public class Game {
    Player player1;
    Player player2;

    Machine machine;

    Game(Player player1, Player player2, Machine machine) {
        this.player1 = player1;
        this.player2 = player2;
        this.machine = machine;
    }

     public Move move() {
        this.player1.move();
        this.player2.move();
        return new Move(player1.getPlayerMove(), player2.getPlayerMove());
    }

    public Score calculateScore(Move move) {
        Score score = machine.calculateScore(move);
        player1.setScore(score.playerOneScore);
        player2.setScore(score.playerTwoScore);
        return score;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Game game = new Game(new AlwaysCheatPlayer(Move.CHEAT), new ConsolePlayer(sc.nextLine()), new Machine());

        for (int i = 0; i < 2; i++) {
            Move move = game.move();
            Score score = game.calculateScore(move);
            System.out.println("ConsolePlayer 1 : after round "+(i+1) +" : "+ + score.playerOneScore);
            System.out.println("ConsolePlayer 2 : after round "+(i+1) +" : "+ score.playerTwoScore);
        }

        System.out.println("After 5 rounds ConsolePlayer 1 : " + game.player1.getScore());
        System.out.println("After 5 rounds ConsolePlayer 2 : " + game.player2.getScore());

    }
}
