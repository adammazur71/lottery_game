package enums;

public enum ValidationError {
    NUMBER_OK("Number has been added"),
    NUMBER_OUT_OF_RANGE("Given number is out of scope! Try again!"),
    NOT_AN_INTEGER("Sorry, but only integers are allowed here! Try again!"),
    REPEATED_NUMBER("Number already added, try again..");
    private final String validationMsg;

    ValidationError(String validationMsg) {
        this.validationMsg = validationMsg;
    }

    public String getValidationMsg() {
        return validationMsg;
    }

    public boolean isError(){
        return this != NUMBER_OK;
    }
}
