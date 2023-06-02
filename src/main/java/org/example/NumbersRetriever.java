package org.example;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NumbersRetriever {
    public static final int AMOUNT_OF_NUMBERS_FROM_USER = 6;

    private final NumberValidator numberValidator = new NumberValidator();

    Set<Integer> retrieve() {
        Set<Integer> numbersFromUser = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Write a number bigger than 0 and smaller than 50. Number " + (numbersFromUser.size() + 1) + " of 6 is: ");
            String givenByUser = scanner.nextLine();
            ValidationResult validate = numberValidator.validate(givenByUser);
            if(!validate.getValidationError().isError()){
                numbersFromUser.add(validate.getNumber());
            }
        } while (numbersFromUser.size() != AMOUNT_OF_NUMBERS_FROM_USER);
        System.out.println("Given numbers are: " + numbersFromUser);
        return numbersFromUser;
    }

}


