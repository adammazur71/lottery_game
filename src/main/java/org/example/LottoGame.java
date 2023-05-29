package org.example;

import enums.GameResultOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LottoGame implements Playable {

    final NumbersRetriever numbersRetriever = new NumbersRetriever();



    @Override
    public GameResult playGame() {
        Set<Integer> numbersFromUser = numbersRetriever.retrieve();
        List<Integer> validatedNumbersFromUser = new ArrayList<>(numbersFromUser);
        Drawing drawing = new Drawing();
        List<Integer> listOfConsecutiveNumbers = drawing.makeListOfConsecutiveNumbers();
        List<Integer> listOfRandomizedNumbers = drawing.randomizeNumbers(listOfConsecutiveNumbers);
        Results results = new Results(listOfRandomizedNumbers, validatedNumbersFromUser);
        GameResultOptions resultOptionEnum = results.checkResult();
        String message = results.checkPrize(resultOptionEnum);
        return new GameResult(message);
    }
}
