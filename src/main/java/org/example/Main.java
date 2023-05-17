package org.example;

public class Main {

    public static void main(String[] args) {
        
        NumbersFromUser numbersFromUser = new NumbersFromUser();
        numbersFromUser.getNumbersFromUser();


        for (int number :
                numbersFromUser.listOfNumbersFromUser) {
            System.out.println(number);
        }



//        Drawing drawing = new Drawing();
//        drawing.setConsecutiveNumbers();
//        drawing.randomizeNumbers();
//
//
//        for (int number :
//                drawing.listOfRandomizedNumbers) {
//            System.out.println(number);
//
//        }
    }
}





