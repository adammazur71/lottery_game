package enums;

public enum ValidationResultOptions {
    NUMBER_OK("Number has been added"),
    NUMBER_OUT_OF_RANGE("Given number is out of scope! Try again!"),
    NOT_AN_INTEGER("Sorry, but only integers are allowed here! Try again!"),
    REPEATED_NUMBER("Number already added, try again..");
    private final String validationMsg;

    ValidationResultOptions(String validationMsg) {
        this.validationMsg = validationMsg;
    }

    public String getValidationMsg() {
        return validationMsg;
    }
}
