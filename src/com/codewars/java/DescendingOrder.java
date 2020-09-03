package com.codewars.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {

    //https://www.codewars.com/kata/5467e4d82edf8bbf40000155

    public static void main(String[] args) {
        System.out.println(sortDesc(42145));
    }

    public static int sortDesc(final int num) {
        return Arrays.stream(String.valueOf(num).split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.collectingAndThen(Collectors.joining(), Integer::parseInt));
    }

}
