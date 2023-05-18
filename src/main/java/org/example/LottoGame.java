package org.example;

import java.util.List;

public class LottoGame implements Playable {

    final NumbersRetriever numbersRetriever = new NumbersRetriever();

    @Override
    public GameResult playGame() {
        List<Integer> numbersFromUser = numbersRetriever.retrieve();
        Drawing drawing = new Drawing();
        drawing.setConsecutiveNumbers();
        drawing.randomizeNumbers();
        Results results = new Results(drawing.listOfRandomizedNumbers, numbersFromUser);
        results.checkResult();
        String message = results.checkPrize();
        return new GameResult(message);
    }
}
