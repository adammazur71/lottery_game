package org.example;

import java.util.ArrayList;
import java.util.List;

public class Results {

    public int result;
    public List<Integer> listOfRandomizedNumbers;
    public List<Integer> listOfNumbersFromUser;

    Results(List<Integer>listOfRandomizedNumbers, List<Integer>listOfNumbersFromUser) {
        this.listOfRandomizedNumbers=listOfRandomizedNumbers;
        this.listOfNumbersFromUser=listOfNumbersFromUser;
    }

    public void checkResult() {
        for (int i = 0; i < listOfRandomizedNumbers.size(); i++) {
            for (int j = 0; j < listOfNumbersFromUser.size(); j++) {
                if (listOfRandomizedNumbers.get(i).equals(listOfNumbersFromUser.get(j))) {
                    result++;
                }
            }
        }
    }

    public void checkPrize() {
        switch (result) {
            case 0:
                System.out.println("You didn't guess any number, sorry no win...");
                break;
            case 1:
                System.out.println("You guessed only 1 number out of 6, sorry no win...");
                break;
            case 2:
                System.out.println("You guessed only 2 numbers out of 6, sorry no win...");
                break;
            case 3:
                System.out.println("You guessed 3 numbers out of 6, you won :-)");
                break;
            case 4:
                System.out.println("You guessed 4 numbers out of 6, you won :-) :-)");
                break;
            case 5:
                System.out.println("You guessed 5 numbers out of 6, you won :-) :-) :-)");
                break;
            case 6:
                System.out.println("You guessed 6 numbers out of 6, you won :-) :-D :-D :-)");
                break;
        }
    }
}
