package org.example;

import java.util.ArrayList;
import java.util.List;

public class LottoGame implements Playable {

    final NumbersRetriever numbersRetriever = new NumbersRetriever();

    @Override
    public GameResult playGame() {
        List<Integer> numbersFromUser = numbersRetriever.retrieve();
        Drawing drawing = new Drawing();
        List<Integer> listOfConsecutiveNumbers = drawing.setListOfConsecutiveNumbers();
        List<Integer> listOfRandomizedNumbers = drawing.randomizeNumbers(listOfConsecutiveNumbers);
        Results results = new Results(listOfRandomizedNumbers, numbersFromUser);
        results.checkResult();
        String message = results.checkPrize();
        return new GameResult(message);
    }
}
