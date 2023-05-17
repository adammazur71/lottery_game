package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Starter {
        Scanner scanner1 = new Scanner(System.in);
    int choiceGame = 0;

    public void starter() {
        System.out.println("Choose your game. Write according number: \n" +
                "1. Lotto 6 from 49 \n" +
                "0. QUIT");
        try {
            choiceGame = scanner1.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Sorry, but only integers are allowed here! Try again!");
            scanner1.nextLine();
            starter();
        }


        switch (choiceGame) {
            case 0:
                System.out.println("Good Bye!");
                System.exit(0);
                break;
            case 1:
                System.out.println("Welcome to 'Lotto 6 from 49'");
                Lotto6from49 lotto6from49 = new Lotto6from49();
                lotto6from49.playGame();
                break;
            default:
                System.out.println("There is no game at this number.. Try again!");
                starter();
                break;
        }

    }
}
