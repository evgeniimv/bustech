package main.java.examtask;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SimpleSorting simpleSorting = new SimpleSorting();
        int[] someArray = {1, 5, 6, 7, 4, 2, 5, 8, 9, 3, 4, 7, 5};
        System.out.println(Arrays.toString(someArray));
        System.out.println(Arrays.toString(simpleSorting.sortArray(someArray, 1, someArray.length)));
    }
}
