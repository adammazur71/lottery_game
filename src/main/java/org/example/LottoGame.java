package org.example;

import enums.ResultOptions;

import java.util.List;

public class LottoGame implements Playable {

    final NumbersRetriever numbersRetriever = new NumbersRetriever();



    @Override
    public GameResult playGame() {
        List<Integer> numbersFromUser = numbersRetriever.retrieve();
        Drawing drawing = new Drawing();
        List<Integer> listOfConsecutiveNumbers = drawing.makeListOfConsecutiveNumbers();
        List<Integer> listOfRandomizedNumbers = drawing.randomizeNumbers(listOfConsecutiveNumbers);
        Results results = new Results(listOfRandomizedNumbers, numbersFromUser);
        ResultOptions resultOptionEnum = results.checkResult();
        String message = results.checkPrize(resultOptionEnum);
        return new GameResult(message);
    }
}
