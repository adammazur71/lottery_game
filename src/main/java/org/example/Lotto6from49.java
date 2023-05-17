package org.example;

public class Lotto6from49 extends Game {
    public void playGame(){
        NumbersFromUser numbersFromUser = new NumbersFromUser();
        Drawing drawing = new Drawing();


        numbersFromUser.getNumbersFromUser();
        drawing.setConsecutiveNumbers();
        drawing.randomizeNumbers();

        Results results = new Results(drawing.listOfRandomizedNumbers, numbersFromUser.listOfNumbersFromUser);
        results.checkResult();
        results.checkPrize();
    }
}
