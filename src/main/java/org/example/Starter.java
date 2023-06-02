package org.example;

import enums.Choice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Starter {
    Scanner scanner = new Scanner(System.in);
    private int choiceGame = -1;
    private Choice choiceGameEnum;

    public String starter() {
        do {
            System.out.println("Choose your game. Write according number: \n" + "1. Lotto 6 from 49 \n" + "0. QUIT");
            try {
                choiceGame = scanner.nextInt();
                choiceGameEnum = Choice.values()[choiceGame];
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException exception) {
                System.out.println("Sorry, but only integers (1 or 0) are allowed here! Try again!");
                scanner.nextLine();
            }
        } while (choiceGame == -1);

        switch (choiceGameEnum) {
            case EXIT:
                return "Good Bye!";
            case LOTTO:
                System.out.println("Welcome to 'Lotto 6 from 49'");
                LottoGame lotto = new LottoGame();
                GameResult gameResult = lotto.playGame();
                return gameResult.getMessage();
            case OTHER_GAME:
                return "other game";
            default:
                throw new IllegalStateException("something went wrong");
        }
    }
}
