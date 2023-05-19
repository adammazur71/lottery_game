package org.example;

import enums.Choice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Starter {
    Scanner scanner = new Scanner(System.in);
    int choiceGame = -1;
    Choice choiceGameEnum;
    public void starter() {
        do {
            System.out.println("Choose your game. Write according number: \n" + "1. Lotto 6 from 49 \n" + "0. QUIT");
            try {
                choiceGame = scanner.nextInt();
                choiceGameEnum = Choice.values()[choiceGame];
//                if(choiceGame == 1){
//                    choiceGameEnum = Choice.LOTTO;
//                } else {
//                    choiceGameEnum = Choice.EXIT;
//                }
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException exception) {
                System.out.println("Sorry, but only integers (1 or 0) are allowed here! Try again!");
                scanner.nextLine();
            }
        } while (choiceGame == -1);
        switch (choiceGameEnum) {
            case EXIT:
                System.out.println("Good Bye!");
                return;
            case LOTTO:
                System.out.println("Welcome to 'Lotto 6 from 49'");
                LottoGame lotto = new LottoGame();
                GameResult gameResult = lotto.playGame();
                System.out.println(gameResult.getMessage());
                break;
            case OTHER_GAME:
                System.out.println("other game");
                break;
        }
    }
}
