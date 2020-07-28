package com.codewars.java;

public class MiddleCharacter {

    //https://www.codewars.com/kata/56747fd5cb988479af000028

    public static void main(String[] args) {
        System.out.println(getMiddle("midle"));
    }

    public static String getMiddle(String word) {
        return word.length() % 2 == 0
                ? word.substring(word.length()/2 - 1, word.length()/2 + 1)
                : String.valueOf(word.charAt(word.length()/2));
    }
}
