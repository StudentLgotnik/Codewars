package com.codewars.java;

public class MissingLetter {

    //https://www.codewars.com/kata/5839edaa6754d6fec10000a2

    public static void main(String[] args) {
        int i = ' ';
        char[] arr = {'a', 'b', 'c', 'd', 'f'};
        char[] arr2 = {'O', 'Q', 'R', 'S'};
        char a = 0;
        System.out.println(a);
        for (int c : arr2) {
            System.out.print(c + " ");
        }
        System.out.println(findMissingLetter(arr));
    }

    public static char findMissingLetter(char[] array) {
        char result = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i+1] - array[i]) != 1) {
                result = (char) (array[i] + 1);
            }
        }
        return result;
    }

}
