package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Starter {
    Scanner scanner = new Scanner(System.in);
    int choiceGame = -1;

    public void starter() {
        do {
            System.out.println("Choose your game. Write according number: \n" +
                    "1. Lotto 6 from 49 \n" +
                    "0. QUIT");
            try {
                choiceGame = scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Sorry, but only integers are allowed here! Try again!");
                scanner.nextLine();

            }
        } while (choiceGame == -1);


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
