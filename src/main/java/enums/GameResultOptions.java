package enums;

public enum GameResultOptions {
    NO_WIN("You should guess min 3 numbers to win, sorry..."),
    THREE_HITS("You guessed 3 numbers out of 6, you won :-)"),
    FOUR_HITS("You guessed 4 numbers out of 6, you won :-) :-)"),
    FIVE_HITS("You guessed 5 numbers out of 6, you won :-) :-) :-)"),
    SIX_HITS("You guessed 6 numbers out of 6, you won :-) :-D :-D :-)");

    private final String message;

    GameResultOptions(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
