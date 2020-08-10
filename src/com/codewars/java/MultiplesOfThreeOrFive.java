package com.codewars.java;

import java.util.stream.IntStream;

public class MultiplesOfThreeOrFive {

    public static void main(String[] args) {
        System.out.println(new MultiplesOfThreeOrFive().solution(10));
    }

    public int solution(int number) {
        return IntStream.range(0, number).filter( n -> n % 3 == 0 || n % 5 == 0).sum();
    }
}
