package com.codewars.java;

public class DigitalRoot {

    //https://www.codewars.com/kata/541c8630095125aba6000c00

    public static void main(String[] args) {
        System.out.println(digital_root(942));
    }

    public static int digital_root(int n) {
        int result = 0;
        while (n >= 1) {
            result += n % 10;
            n = n/10;
        }

        if (result > 9) {
            return digital_root(result);
        } else {
            return result;
        }
    }
}
