package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Drawing {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 49;
    public List<Integer> makeListOfConsecutiveNumbers() {
        List<Integer> listOfConsecutiveNumbers = new ArrayList<>();
        for (int i = MIN_NUMBER; i <= MAX_NUMBER; i++) {
            listOfConsecutiveNumbers.add(i);
        }
        return listOfConsecutiveNumbers;
    }
    public List<Integer> randomizeNumbers(List<Integer> listOfConsecutiveNumbers) {
        System.out.println("Drawing....");
        Collections.shuffle(listOfConsecutiveNumbers);
        List<Integer> listOfRandomizedNumbers = listOfConsecutiveNumbers.subList(0, 6);
        Collections.sort(listOfRandomizedNumbers);
        System.out.println("The drawn numbers are: " + listOfRandomizedNumbers);
        return listOfRandomizedNumbers;


    }

}
