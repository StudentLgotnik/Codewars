package com.codewars.java;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class HighestAndLowest {

    //https://www.codewars.com/kata/554b4ac871d6813a03000035

    public static void main(String[] args) {
        System.out.println(highAndLowBetter("3 45 22 94 -3"));
    }

    public static String highAndLow(String numbers) {
        int[] array = Arrays.stream(numbers.split(" ")).mapToInt(Integer::valueOf).sorted().toArray();
        return array[array.length-1] + " " + array[0];
    }

    public static String highAndLowBetter(String numbers) {
        IntSummaryStatistics statistics = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        return String.format("%d %d", statistics.getMax(), statistics.getMin());
    }

}
