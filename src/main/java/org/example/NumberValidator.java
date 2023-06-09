package org.example;

import enums.ValidationError;


public class NumberValidator {

//    private final List<ValidationError> validationResults = List.of();

//    NumberValidator() {
//    }

    ValidationResult validate(String givenByUser) {
        ValidationResult validationResult = checkIfNumber(givenByUser);
        if (!validationResult.getValidationError().isError()) {
            return checkIfNumberInRange(validationResult.getNumber());
        }
        return validationResult;
    }

    private ValidationResult checkIfNumberInRange(int numberFromUser) {
        if (numberFromUser < Drawing.MIN_NUMBER || numberFromUser > Drawing.MAX_NUMBER) {
            System.out.println(ValidationError.NUMBER_OUT_OF_RANGE.getValidationMsg());
            return new ValidationResult(ValidationError.NUMBER_OUT_OF_RANGE);
        }
        return new ValidationResult(ValidationError.NUMBER_OK, numberFromUser);
    }

    private ValidationResult checkIfNumber(String givenByUser) {
        try {
            int parsedNumber = Integer.parseInt(givenByUser);
            return new ValidationResult(ValidationError.NUMBER_OK, parsedNumber);
        } catch (NumberFormatException exception) {
            System.out.println(ValidationError.NOT_AN_INTEGER.getValidationMsg());
            return new ValidationResult(ValidationError.NOT_AN_INTEGER);
        }
    }

}
