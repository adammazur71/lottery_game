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
    public void randomizeNumbers(){
        Collections.shuffle(consecutiveNumbers);
        List<Integer> randomizedNumbers = new ArrayList<>(consecutiveNumbers);

    }
}
