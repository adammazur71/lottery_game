package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Drawing {
    public List<Integer> makeListOfConsecutiveNumbers() {
        List<Integer> listOfConsecutiveNumbers = new ArrayList<>();
        for (int i = 1; i < 50; i++) {
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
