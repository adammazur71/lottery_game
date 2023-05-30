package org.example;

import enums.ValidationResultOptions;


public class NumberValidator {

    private boolean checkIfNumberInRange(int numberFromUser) {
        if (numberFromUser < Drawing.MIN_NUMBER || numberFromUser > Drawing.MAX_NUMBER) {
            System.out.println(ValidationResultOptions.NUMBER_OUT_OF_RANGE.getValidationMsg());
            return false;
        } else {
            return true;
        }
    }

    private boolean checkIfInteger(String givenByUser) {
        try {
            returnNumberFromGivenByUser(givenByUser);
            return true;
        } catch (NumberFormatException exception) {
            System.out.println(ValidationResultOptions.NOT_AN_INTEGER.getValidationMsg());
            return false;
        }
    }

    private int returnNumberFromGivenByUser(String givenByUser) {
        return Integer.parseInt(givenByUser);
    }

    int returnValidatedNumber(String givenByUser) {
        int numberFromUser;
        if (checkIfInteger(givenByUser)) {
            numberFromUser = returnNumberFromGivenByUser(givenByUser);
        } else {
            return 0;
        }
        if (checkIfNumberInRange(numberFromUser)) {
            int validatedNumberFromUser = numberFromUser;
            System.out.println(ValidationResultOptions.NUMBER_OK.getValidationMsg());
            return validatedNumberFromUser;
        } else {
            return 0;
        }
    }
}
