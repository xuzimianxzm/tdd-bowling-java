package com.xuzimian.bowling.test;

import com.xuzimian.bowling.Scorer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScorerTest {

    @Test
    void when_In_a_round_given_Throw_the_ball_twice_Did_not_knock_down_the_bottles_then_zero() {
        int firstKnockdownNum = 0, secondKnockdownNum = 0;

        int actual = Scorer.scoreInRound(firstKnockdownNum, secondKnockdownNum, null);

        assertEquals(0, actual);
    }

    @Test
    void when_In_a_round_given_throw_the_ball_twice_Did_not_knock_down_all_bottles_then_Number_of_bottles_poured() {
        int firstKnockdownNum = 3, secondKnockdownNum = 5;

        int actual = Scorer.scoreInRound(firstKnockdownNum, secondKnockdownNum, null);

        assertEquals(firstKnockdownNum + secondKnockdownNum, actual);
    }

    @Test
    void when_In_a_round_given_throw_first_is_STRIKE_then_ten_plus_the_number_of_inverted_bottles_tossed_in_the_next_two() {
        int strike = 10, secondKnockdownNum = 5, thirdKnockdownNum = 8;

        int actual = Scorer.scoreInRound(strike, secondKnockdownNum, thirdKnockdownNum);

        assertEquals(strike + secondKnockdownNum + thirdKnockdownNum, actual);
    }

    @Test
    void when_In_a_round_given_throw_second_ball_knock_down_all_bottles_then_ten_plus_the_number_of_inverted_bottles_tossed_in_the_next() {
        int firstKnockdownNum = 4, secondKnockdownNum = 6, thirdKnockdownNum = 3;

        int actual = Scorer.scoreInRound(firstKnockdownNum, secondKnockdownNum, thirdKnockdownNum);

        assertEquals(firstKnockdownNum + secondKnockdownNum + thirdKnockdownNum, actual);
    }
}
