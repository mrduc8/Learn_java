package com.learnjava.completejavabase.gamekeobuabao;
import java.util.Scanner;

public class Game {
    String userPick;
    String computerPick;
    String result;

    String getComputerPick(){
        String computerPick;
        int randomNumber = (int) (Math.random() * 3)+ 1;
        if (randomNumber == 1){
            computerPick = "Rock";
        } else if (randomNumber == 2) {
            computerPick = "Paper";
        }
        else {
            computerPick = "Scissors";
        }
        return computerPick;
    }

    String getUserPick() {

        Scanner input = new Scanner(System.in);

        String userPick;

        // get input until user enters "rock", "paper" or "scissors"
        while (true) {

            System.out.println("Enter rock, paper or scissors:");
            userPick = input.nextLine();

            if (userPick.equals("rock") || userPick.equals("paper") || userPick.equals("scissors")) {
                break;
            }
        }

        return userPick;
    }

    // return either "win", "lose" or "draw"
    String getResult(String userPick, String computerPick) {

        // condition for user to draw
        if (userPick.equals(computerPick)) {
            return "draw";
        }

        // condition for user to win
        else if (userPick.equals("paper") && computerPick.equals("rock")) {
            return "win";
        }

        else if (userPick.equals("rock") && computerPick.equals("scissors")) {
            return "win";
        }

        else if (userPick.equals("scissors") && computerPick.equals("paper")) {
            return "win";
        }

        // all conditions results to loss
        else {
            return "lose";
        }
    }
}
