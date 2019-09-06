package com.tdd.tw;

import java.util.Scanner;

public class ConsolePlayer extends Player{

    Scanner sc;
    ConsolePlayer(Scanner scanner) {
        this.sc = scanner;
    }

    void move() {
        super.playerMove = sc.nextLine();
    }
}
