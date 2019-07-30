package main.java.examtask;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SimpleSorting simpleSorting = new SimpleSorting();
        int[] someArray = {5, 2, 4, 6, 1, 3, 2, 6};
        System.out.println(Arrays.toString(simpleSorting.sortArray(someArray, 1, someArray.length)));
    }
}
