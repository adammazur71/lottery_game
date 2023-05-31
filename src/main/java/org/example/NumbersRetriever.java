package org.example;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NumbersRetriever {
    public static final int AMOUNT_OF_NUMBERS_FROM_USER = 6;

    Set<Integer> retrieve() {

        Set<Integer> setOfNumbersFromUser = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Write a number bigger than 0 and smaller than 50. Number " + (setOfNumbersFromUser.size() + 1) + " of 6 is: ");
            String givenByUser = scanner.nextLine();
            int validatedNumberFromUser = (new NumberValidator(givenByUser)).getValidatedNumber();
            if (validatedNumberFromUser != 0) {
                setOfNumbersFromUser.add(validatedNumberFromUser);
            }
        } while (setOfNumbersFromUser.size() != AMOUNT_OF_NUMBERS_FROM_USER);
        System.out.println("Given numbers are: " + setOfNumbersFromUser);
        return setOfNumbersFromUser;
    }
}


