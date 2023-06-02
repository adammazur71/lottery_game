package org.example;

import enums.ValidationError;
import lombok.Data;
import lombok.Value;

@Data
@Value
public class ValidationResult {

    ValidationError validationError;
    Integer number;

    ValidationResult(ValidationError validationError) {
        this.validationError = validationError;
        this.number = null;
    }

    ValidationResult(ValidationError validationError, Integer number) {
        this.validationError = validationError;
        this.number = number;
    }
}
