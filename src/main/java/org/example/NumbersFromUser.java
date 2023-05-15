package org.example;

import java.util.Set;
import java.util.TreeSet;

public class NumbersFromUser {

    private int numberFromUser;

    Set<Integer> setOfNumbersFromUser = new TreeSet<>();

    public int getNumberFromUser() {
        return numberFromUser;
    }

    public void setNumberFromUser(int numberFromUser) {
        this.numberFromUser = numberFromUser;
    }
}
