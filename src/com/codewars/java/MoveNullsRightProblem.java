package com.codewars.java;

import java.util.Arrays;
import java.util.Objects;

/**
 * Given an array of objects, move all the nulls to the end of the array.
 * Perform the transformation in-place without additional allocation.
 */
public class MoveNullsRightProblem {

    void solve(Object[] arr) {

        int emptySpaceIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Objects.nonNull(arr[i])){
                if (emptySpaceIndex != i) {
                    arr[emptySpaceIndex] = arr[i];
                    arr[i] = null;
                }
                emptySpaceIndex++;
            }
        }

    }

    public static void main(String[] args) {
        MoveNullsRightProblem moveNullsRightProblem = new MoveNullsRightProblem();

        Object[] movedObjects = new Object[] {"A", "B", null, null, "C", "D", null, null};
        moveNullsRightProblem.solve(movedObjects);
        System.out.println("Paired order: " + Arrays.toString(movedObjects));

        movedObjects = new Object[] {"A", null, "B", null, "C", null};
        moveNullsRightProblem.solve(movedObjects);
        System.out.println("Checkerboard order: " + Arrays.toString(movedObjects));

        movedObjects = new Object[] {"A", "B", "C", "D", "E", "F"};
        moveNullsRightProblem.solve(movedObjects);
        System.out.println("No null objets: " + Arrays.toString(movedObjects));

        movedObjects = new Object[] {null, "A", "B", "C", "D", "E", "F"};
        moveNullsRightProblem.solve(movedObjects);
        System.out.println("First null objet: " + Arrays.toString(movedObjects));

        movedObjects = new Object[] {"A", "B", "C", "D", "E", "F", null};
        moveNullsRightProblem.solve(movedObjects);
        System.out.println("Last null objet: " + Arrays.toString(movedObjects));

        movedObjects = new Object[] {null, null, null, null, null, null, null};
        moveNullsRightProblem.solve(movedObjects);
        System.out.println("All null objets: " + Arrays.toString(movedObjects));

        movedObjects = new Object[] {"A", null, null, null, null, null};
        moveNullsRightProblem.solve(movedObjects);
        System.out.println("First not null objet: " + Arrays.toString(movedObjects));

        movedObjects = new Object[] {null, null, null, null, null, null, "A"};
        moveNullsRightProblem.solve(movedObjects);
        System.out.println("Last not null objet: " + Arrays.toString(movedObjects));

        movedObjects = new Object[] {"A", null, null, null, null, null, "B"};
        moveNullsRightProblem.solve(movedObjects);
        System.out.println("Not null ends: " + Arrays.toString(movedObjects));

        movedObjects = new Object[] {null, "A", "B", "C", "D", "E", null};
        moveNullsRightProblem.solve(movedObjects);
        System.out.println("Null ends: " + Arrays.toString(movedObjects));
    }


}
