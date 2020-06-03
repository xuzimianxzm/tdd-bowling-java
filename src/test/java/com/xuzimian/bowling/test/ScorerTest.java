package com.xuzimian.bowling.test;

import com.xuzimian.bowling.Scorer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScorerTest {

    @Test
    void when_In_a_round_given_Throw_the_ball_twice_Did_not_knock_down_the_bottles_then_zero() {
        int first = 3, second = 5;

        int fraction = Scorer.score(first, second, null);

        assertEquals(first + second, fraction);
    }

    @Test
    void when_In_a_round_given_throw_the_ball_twice_Did_not_knock_down_all_bottles_then_Number_of_bottles_poured() {

    }

    @Test
    void when_In_a_round_given_throw_first_is_STRIKE_then_ten_plus_the_number_of_inverted_bottles_tossed_in_the_next_two() {

    }

    @Test
    void when_In_a_round_given_throw_secon_ball_knock_down_all_bottles_then_ten_plus_the_number_of_inverted_bottles_tossed_in_the_next() {

    }
}
