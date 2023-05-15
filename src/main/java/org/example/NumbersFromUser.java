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
        if (numberFromUser<=0 || numberFromUser>=100) {
            System.out.println("Given number is out of scope");
        }
        else {
            this.numberFromUser = numberFromUser;
        }
    }
}
