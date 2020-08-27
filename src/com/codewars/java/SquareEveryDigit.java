package com.codewars.java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SquareEveryDigit {

    //https://www.codewars.com/kata/546e2562b03326a88e000020

    public static void main(String[] args) {
        System.out.println(new SquareEveryDigit().squareDigitsEasier(9119 ));
    }

    public int squareDigits(int n) {
        return Arrays.stream(String.valueOf(n).split(""))
                .mapToDouble(Double::parseDouble)
                .mapToObj(d -> String.valueOf(Math.round(Math.pow(d, 2))))
                .collect(Collectors.collectingAndThen(Collectors.joining(), Integer::parseInt));
    }

    public int squareDigitsEasier(int n) {
        return Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt)
                .mapToObj(i -> String.valueOf(i * i))
                .collect(Collectors.collectingAndThen(Collectors.joining(), Integer::parseInt));
    }


}
