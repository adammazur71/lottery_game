package org.example;

import enums.GameResultOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LottoGame implements Playable {

    final NumbersRetriever numbersRetriever = new NumbersRetriever();
    final Drawing drawing = new Drawing();

    @Override
    public GameResult playGame() {
        Set<Integer> numbersFromUser = numbersRetriever.retrieve();
        List<Integer> validatedNumbersFromUser = new ArrayList<>(numbersFromUser);
        List<Integer> listOfConsecutiveNumbers = drawing.makeListOfConsecutiveNumbers();
        List<Integer> listOfRandomizedNumbers = drawing.randomizeNumbers(listOfConsecutiveNumbers);
        Results results = new Results(listOfRandomizedNumbers, validatedNumbersFromUser);
        GameResultOptions resultOptionEnum = results.checkResult();
        String message = results.checkPrize(resultOptionEnum);
        return new GameResult(message);
    }
}
