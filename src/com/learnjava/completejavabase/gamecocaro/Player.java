package com.learnjava.completejavabase.gamecocaro;

import java.util.Scanner;

public class Player {

    String name;

    String type;

    Player(String type) {
        this.type = type;
        Scanner input = new Scanner(System.in);
        if (type == "X") {
            System.out.println("Player selecting X, enter your name: ");
            name = input.nextLine();
        }
        else {
            System.out.println("Player selecting O, enter your name: ");
            name = input.nextLine();
        }
    }

}
