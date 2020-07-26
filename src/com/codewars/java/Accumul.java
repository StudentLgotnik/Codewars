package com.codewars.java;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Accumul {

    //https://www.codewars.com/kata/5667e8f4e3f572a8f2000039

    public static void main(String[] args) {
        System.out.println("Accumulated: " + accumBetter("NyffsGeyylB"));
    }

    public static String accum(String s) {
        AtomicInteger counter = new AtomicInteger();
        return Stream.of(s.split(""))
                .map(str -> str.toUpperCase() + String.join("", Collections.nCopies(counter.getAndIncrement(), str.toLowerCase())))
                .collect(Collectors.joining("-"));
    }

    public static String accumBetter(String s) {
        return IntStream.range(0, s.length())
                .mapToObj(i -> Character.toUpperCase(s.charAt(i)) + String.join("", Collections.nCopies(i, String.valueOf(s.charAt(i)).toLowerCase())))
                .collect(Collectors.joining("-"));
    }
}
