package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockSettings;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

import java.util.*;

import static org.mockito.Mockito.*;

public class LottoGameTest {

    NumbersRetriever numbersRetrieverMock = mock(NumbersRetriever.class);



    Drawing drawingMock = mock(Drawing.class);

    @Test
    void win_six_of_six() {

        
        LottoGame lottoGame = new LottoGame();
        GameResult realResult = lottoGame.playGame();
        when(numbersRetrieverMock.retrieve()).thenReturn(new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6)));
        when(drawingMock.makeListOfConsecutiveNumbers()).thenReturn(new ArrayList<>(List.of(1, 2, 3, 4, 5, 6)));
        GameResult expectedResult = new GameResult("You guessed 6 numbers out of 6, you won :-) :-D :-D :-)");
        Assertions.assertThat(realResult.getMessage()).isEqualTo(expectedResult.getMessage());

    }

}
