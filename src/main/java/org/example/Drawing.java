package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Drawing {
    List<Integer> listOfConsecutiveNumbers = new ArrayList<>();
    List<Integer> listOfRandomizedNumbers;

    public void setConsecutiveNumbers() {
        for (int i = 1; i < 50; i++) {
            listOfConsecutiveNumbers.add(i);
        }
    }

    public void randomizeNumbers() {
        System.out.println("Drawing....");
        Collections.shuffle(listOfConsecutiveNumbers);
        listOfRandomizedNumbers = listOfConsecutiveNumbers.subList(0, 6);
        Collections.sort(listOfRandomizedNumbers);
        System.out.println("The drawn numbers are: " + listOfRandomizedNumbers);

    }

}
