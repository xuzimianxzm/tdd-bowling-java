package com.xuzimian.bowling;

public class Scorer {

    public static int scoreInRound(int firstKnockdownNum, int secondKnockdownNum, Integer thirdKnockdownNum) {
        if (10 > (firstKnockdownNum + secondKnockdownNum)) {
            return firstKnockdownNum + secondKnockdownNum;
        }

        if (10 == firstKnockdownNum) {
            return firstKnockdownNum + secondKnockdownNum + thirdKnockdownNum;
        }

        if (10 == (firstKnockdownNum + secondKnockdownNum)) {
            return firstKnockdownNum + secondKnockdownNum + thirdKnockdownNum;
        }

        return 0;
    }
}
