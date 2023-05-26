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
            resultOptionEnum = ResultOptions.NO_WIN;
        } else if (result == 3) {
            resultOptionEnum = ResultOptions.THREE_HITS;
        } else if (result == 4) {
            resultOptionEnum = ResultOptions.FOUR_HITS;
        } else if (result == 5) {
            resultOptionEnum = ResultOptions.FIVE_HITS;
        } else if (result == 6) {
            resultOptionEnum = ResultOptions.SIX_HITS;
        }
        return resultOptionEnum;
    }


    public String checkPrize(ResultOptions resultOptionEnum) {
        switch (resultOptionEnum) {
            case NO_WIN:
                return ResultOptions.NO_WIN.getMessage();
            case THREE_HITS:
                return ResultOptions.THREE_HITS.getMessage();
            case FOUR_HITS:
                return ResultOptions.FOUR_HITS.getMessage();
            case FIVE_HITS:
                return ResultOptions.FIVE_HITS.getMessage();
            case SIX_HITS:
                return ResultOptions.SIX_HITS.getMessage();
            default:
                throw new IllegalStateException("no option found");
        }
    }
}
