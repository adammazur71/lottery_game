package org.example;

import java.util.List;

public class Results {

    public int result;
    public List<Integer> listOfRandomizedNumbers;
    public List<Integer> listOfNumbersFromUser;

    Results(List<Integer> listOfRandomizedNumbers, List<Integer> listOfNumbersFromUser) {
        this.listOfRandomizedNumbers = listOfRandomizedNumbers;
        this.listOfNumbersFromUser = listOfNumbersFromUser;
    }

    public void checkResult() {
        for (int i = 0; i < listOfRandomizedNumbers.size(); i++) {
            for (int j = 0; j < listOfNumbersFromUser.size(); j++) {
                if (listOfRandomizedNumbers.get(i).equals(listOfNumbersFromUser.get(j))) {
                    result++;
                }
            }
        }
    }

    public String checkPrize() {
        switch (result) {
            case 0:
                return "You didn't guess any number, sorry no win...";
            case 1:
                return "You guessed only 1 number out of 6, sorry no win...";
            case 2:
                return "You guessed only 2 numbers out of 6, sorry no win...";
            case 3:
                return "You guessed 3 numbers out of 6, you won :-)";
            case 4:
                return "You guessed 4 numbers out of 6, you won :-) :-)";
            case 5:
                return "You guessed 5 numbers out of 6, you won :-) :-) :-)";
            case 6:
                return "You guessed 6 numbers out of 6, you won :-) :-D :-D :-)";
            default:
                throw new IllegalStateException("no option found");
        }
    }
}
