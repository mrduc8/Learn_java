package com.learnjava.completejavabase.gamekeobuabao;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        String userPick = game.getUserPick();
        String computerPick = game.getComputerPick();
        String result = game.getResult(userPick, computerPick);

        System.out.println("User Pick: " + userPick);
        System.out.println("Computer Pick: " + computerPick);
        System.out.println("You " + result);
    }
}
