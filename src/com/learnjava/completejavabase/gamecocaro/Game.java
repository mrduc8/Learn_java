package com.learnjava.completejavabase.gamecocaro;

import java.util.Scanner;

public class Game {
    Board board = new Board();
    Player player1 = new Player("X");
    Player player2 = new Player("Y");
    Player currentPlayer = player1;

    // this method will be later used to play the game
    void play() {
        // using an infinite loop to run the game
        // we will later add conditions to terminate the loop
        String message = "enter the position (1 - 9):";
        while (true) {

            message = "enter the position (1 - 9):";
            System.out.println(currentPlayer.name + " " + message);
            Scanner input = new Scanner(System.in);
            int position = input.nextInt();

            // the updateBoard() method return true if
            // the user selected position is not already filled
            if (board.updateBoard(position, currentPlayer.type)) {

                board.printBoard();

                // changing current player when board is updated
                if (currentPlayer == player1) {
                    currentPlayer = player2;
                } else {
                    currentPlayer = player1;

                }

            }

        }
    }
}
