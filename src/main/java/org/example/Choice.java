package org.example;

public enum Choice {

    EXIT(0),
    LOTTO(1),
    OTHER_GAME(-1);

    int option;

    Choice(int option) {
        this.option = option;
    }
}
