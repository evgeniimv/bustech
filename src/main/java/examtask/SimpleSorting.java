package main.java.examtask;

public class SimpleSorting {

    public int[] sortArray(int[] array, int start, int end) {
        if (start < end) {
            int halfOfArray = (int) Math.floor((double) (start + end) / 2);
            sortArray(array, start, halfOfArray);
            sortArray(array, halfOfArray + 1, end);
            mergeSortedArrayParts(array, start, halfOfArray, end);
        }
        return array;
    }

    private void mergeSortedArrayParts(int[] array, int start, int halfOfArray, int end) {
        int start0 = start - 1;
        int halfOfArray0 = halfOfArray;
        int[] mergedArray = new int[array.length];
        swapArray(array, mergedArray, 1, array.length);
        for (int i = start0; i < end - 1; i++) {
            if (start0 != halfOfArray && halfOfArray0 != end) {
                if (array[start0] < array[halfOfArray0]) {
                    mergedArray[i] = array[start0];
                    start0++;
                } else if (array[start0] == array[halfOfArray0]) {
                    mergedArray[i] = array[start0];
                    mergedArray[++i] = array[halfOfArray0];
                    start0++;
                    halfOfArray0++;
                } else {
                    mergedArray[i] = array[halfOfArray0];
                    halfOfArray0++;
                }
            }
            if (start0 == halfOfArray && halfOfArray0 != end) {
                mergedArray[i + 1] = array[halfOfArray0];
                halfOfArray0++;
            }
            if (halfOfArray0 == end && start0 != halfOfArray) {
                mergedArray[i + 1] = array[start0];
                start0++;
            }
        }
        swapArray(mergedArray, array, 1, array.length);
    }

    private void swapArray(int[] fromArray, int[] toArray, int start, int end) {
        for (int i = start - 1; i < end; i++) {
            toArray[i] = fromArray[i];
        }
    }
}
