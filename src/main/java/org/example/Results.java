package org.example;

import enums.GameResultOptions;

import java.util.List;

public class Results {

    private int result;
    private final List<Integer> listOfRandomizedNumbers;
    private final List<Integer> listOfNumbersFromUser;
    private GameResultOptions resultOptionEnum;

    Results(List<Integer> listOfRandomizedNumbers, List<Integer> listOfNumbersFromUser) {
        this.listOfRandomizedNumbers = listOfRandomizedNumbers;
        this.listOfNumbersFromUser = listOfNumbersFromUser;
    }

    public GameResultOptions checkResult() {
        for (int i = 0; i < listOfRandomizedNumbers.size(); i++) {
            for (int j = 0; j < listOfNumbersFromUser.size(); j++) {
                if (listOfRandomizedNumbers.get(i).equals(listOfNumbersFromUser.get(j))) {
                    result++;
                }
            }
        }
        if (result <= 2) {
            resultOptionEnum = GameResultOptions.NO_WIN;
        } else if (result == 3) {
            resultOptionEnum = GameResultOptions.THREE_HITS;
        } else if (result == 4) {
            resultOptionEnum = GameResultOptions.FOUR_HITS;
        } else if (result == 5) {
            resultOptionEnum = GameResultOptions.FIVE_HITS;
        } else if (result == 6) {
            resultOptionEnum = GameResultOptions.SIX_HITS;
        }
        return resultOptionEnum;
    }


    public String checkPrize(GameResultOptions resultOptionEnum) {
        switch (resultOptionEnum) {
            case NO_WIN:
                return GameResultOptions.NO_WIN.getMessage();
            case THREE_HITS:
                return GameResultOptions.THREE_HITS.getMessage();
            case FOUR_HITS:
                return GameResultOptions.FOUR_HITS.getMessage();
            case FIVE_HITS:
                return GameResultOptions.FIVE_HITS.getMessage();
            case SIX_HITS:
                return GameResultOptions.SIX_HITS.getMessage();
            default:
                throw new IllegalStateException("no option found");
        }
    }
}
