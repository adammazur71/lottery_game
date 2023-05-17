package org.example;

public class Main {

    public static void main(String[] args) {
        
        NumbersFromUser numbersFromUser = new NumbersFromUser();
        Drawing drawing = new Drawing();


        numbersFromUser.getNumbersFromUser();
        drawing.setConsecutiveNumbers();
        drawing.randomizeNumbers();

        Results results = new Results(drawing.listOfRandomizedNumbers,numbersFromUser.listOfNumbersFromUser);
        results.checkResult();
        results.checkPrize();







    }
}





