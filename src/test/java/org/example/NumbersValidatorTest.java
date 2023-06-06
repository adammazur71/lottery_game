package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class NumbersValidatorTest {

    NumberValidator numberValidator = new NumberValidator();

    private static Stream<String> provideNotAllowedNumbersOrNotNumbers() {
        final String numberTooBig = Integer.toString(Drawing.MAX_NUMBER + 1);
        final String numberTooSmall = Integer.toString(Drawing.MIN_NUMBER - 1);
        final String notANumber = "a";
        return Stream.of(numberTooBig, numberTooSmall, notANumber);
    }

    @ParameterizedTest(name = "Checking incorrect number {0}")
    @MethodSource("provideNotAllowedNumbersOrNotNumbers")
    void number_validation_should_give_error(String givenByUser) {
        // given
        boolean expectedIsError = true;
        // when
        ValidationResult realValidationResult = numberValidator.validate(givenByUser);
        boolean realIsError = realValidationResult.getValidationError().isError();
        // then
        Assertions.assertThat(realIsError).isEqualTo(expectedIsError);
    }

    private static Stream<String> provideCorrectNumbers() {
        final String maxNumber = Integer.toString(Drawing.MAX_NUMBER);
        final String minNumber = Integer.toString(Drawing.MIN_NUMBER);
        return Stream.of(maxNumber, minNumber);
    }
    @ParameterizedTest(name = "Checking correct number {0}")
    @MethodSource("provideCorrectNumbers")
    void number_validation_should_accept_given_numbers(String givenByUser) {
        // given
        boolean expectedIsError = false;
        // when
        ValidationResult realValidationResult = numberValidator.validate(givenByUser);
        boolean realIsError = realValidationResult.getValidationError().isError();
        // then
        Assertions.assertThat(realIsError).isEqualTo(expectedIsError);
    }
}
