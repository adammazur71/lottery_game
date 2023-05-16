package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Drawing {
    List<Integer> consecutiveNumbers = new ArrayList<>();

    public void setConsecutiveNumbers() {
        for (int i = 1; i < 100; i++) {
            consecutiveNumbers.add(i);
        }
    }
    public int[] randomizeNumbers(){
        Collections.shuffle(consecutiveNumbers);
        int[] randomizedNumbers = new int[6];
        for (int i = 0; i < 6; i++) {
            randomizedNumbers[i] = consecutiveNumbers.get(i);
        }
        return randomizedNumbers;
    }
}
