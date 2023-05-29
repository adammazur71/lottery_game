package org.example;

import enums.ValidationResultOptions;


public class NumberValidator {
    private int numberFromUser;

    boolean checkNumberRange(int numberFromUser) {
        if (numberFromUser < Drawing.MIN_NUMBER || numberFromUser > Drawing.MAX_NUMBER) {
            System.out.println(ValidationResultOptions.NUMBER_OUT_OF_RANGE.getValidationMsg());
            return false;
        } else {
            return true;
        }
    }

    boolean checkIfInteger(String givenByUser) {
        try {
            numberFromUser = Integer.parseInt(givenByUser);
            return true;
        } catch (NumberFormatException exception) {
            System.out.println(ValidationResultOptions.NOT_AN_INTEGER.getValidationMsg());
            return false;
        }
    }

    int validateNumber(String givenByUser) {
        int validatedNumberFromUser;
        if (checkIfInteger(givenByUser) && checkNumberRange(numberFromUser)) {
            validatedNumberFromUser = numberFromUser;
            System.out.println(ValidationResultOptions.NUMBER_OK.getValidationMsg());
            return validatedNumberFromUser;
        } else {
            return 0;
        }
    }
}
