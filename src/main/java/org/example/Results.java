package org.example;

public class Results {

    public int result;
    NumbersFromUser numbersFromUser = new NumbersFromUser();
    Drawing drawing = new Drawing();

    public int checkResult() {
        for (int i = 0; i < drawing.listOfRandomizedNumbers.size(); i++) {
            for (int j = 0; j < numbersFromUser.listOfNumbersFromUser.size(); j++) {
                if (drawing.listOfRandomizedNumbers.get(i).equals(numbersFromUser.listOfNumbersFromUser.get(j))) {
                    result++;
                }
            }
        }
        return result;
    }

    public void checkPrize() {
        switch (result) {
            case 1:
                System.out.println("You guessed only 1 number  of 6, sorry no win...");
            case 2:
                System.out.println("You guessed only 2 numbers of 6, sorry no win...");
            case 3:
                System.out.println("You guessed 3 numbers of 6, you won :-)");
            case 4:
                System.out.println("You guessed 4 numbers of 6, you won :-) :-)");
            case 5:
                System.out.println("You guessed 3 numbers of 6, you won :-) :-) :-)");
            case 6:
                System.out.println("You guessed 3 numbers of 6, you won :-) :-D :-D :-)");
        }
    }
}
