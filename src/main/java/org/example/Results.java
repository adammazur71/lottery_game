package org.example;

import enums.ResultOptions;

import java.util.List;

public class Results {

    private int result;
    private final List<Integer> listOfRandomizedNumbers;
    private final List<Integer> listOfNumbersFromUser;
    private ResultOptions resultOptionEnum;

    Results(List<Integer> listOfRandomizedNumbers, List<Integer> listOfNumbersFromUser) {
        this.listOfRandomizedNumbers = listOfRandomizedNumbers;
        this.listOfNumbersFromUser = listOfNumbersFromUser;
    }

    public ResultOptions checkResult() {
        for (int i = 0; i < listOfRandomizedNumbers.size(); i++) {
            for (int j = 0; j < listOfNumbersFromUser.size(); j++) {
                if (listOfRandomizedNumbers.get(i).equals(listOfNumbersFromUser.get(j))) {
                    result++;
                }
            }
        }
        if (result <= 2) {
            resultOptionEnum = ResultOptions.NOTHING;
        } else if (result == 3) {
            resultOptionEnum = ResultOptions.THREE;
        } else if (result == 4) {
            resultOptionEnum = ResultOptions.FOUR;
        } else if (result == 5) {
            resultOptionEnum = ResultOptions.FIVE;
        } else if (result == 6) {
            resultOptionEnum = ResultOptions.SIX;
        }
        return resultOptionEnum;
    }


    public String checkPrize(ResultOptions resultOptionEnum) {
        switch (resultOptionEnum) {
            case NOTHING:
                return "You didn't guess any number, sorry no win...";
            case THREE:
                return "You guessed 3 numbers out of 6, you won :-)";
            case FOUR:
                return "You guessed 4 numbers out of 6, you won :-) :-)";
            case FIVE:
                return "You guessed 5 numbers out of 6, you won :-) :-) :-)";
            case SIX:
                return "You guessed 6 numbers out of 6, you won :-) :-D :-D :-)";
            default:
                throw new IllegalStateException("no option found");
        }
    }
}
