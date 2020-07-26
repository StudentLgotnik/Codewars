package com.codewars.java;

import java.util.Arrays;
import java.util.regex.Pattern;

public class VowelCount {

    //https://www.codewars.com/kata/54ff3102c1bad923760001f3

    public static void main(String[] args) {
        System.out.println("Vowel count: " + getCount("asdfgd asrewgf wqdfgo"));
    }

    public static int getCount(String str) {
        return (int) Arrays.stream(str.split(""))
                .parallel()
                .filter(Pattern.compile("^[aeiou]$").asPredicate())
                .count();
    }

    public static int getCountBetter(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }

}
