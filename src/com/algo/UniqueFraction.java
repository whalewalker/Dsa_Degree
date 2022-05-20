package com.algo;

import java.util.*;

public class UniqueFraction {
    public static int[][] solve(int[][] fractions) {
        Set<int[]> uniqueFraction = new TreeSet<>((fraction1, fraction2) ->
                (fraction1[0] * fraction2[1]) - (fraction2[0] * fraction1[1]));

        for (int[] fraction : fractions) {
            int numirator = fraction[0], denominator = fraction[1];

            int divisor = getGreatestCommonDivisor(Math.max(Math.abs(numirator),
                    Math.abs(denominator)), Math.min(Math.abs(denominator), Math.abs(numirator)));

            uniqueFraction.add(new int[]{numirator / divisor, denominator / divisor});
        }

        int [][] result = new int[uniqueFraction.size()][uniqueFraction.size()];
        result = uniqueFraction.toArray(result);
        return result;
    }

    public static int getGreatestCommonDivisor(int numirator, int denominator){

        if (denominator == 0)
            return numirator;
        return getGreatestCommonDivisor(denominator, numirator % denominator);
    }

}
