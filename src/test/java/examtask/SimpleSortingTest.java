package test.java.examtask;

import main.java.examtask.SimpleSorting;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SimpleSortingTest {
    private SimpleSorting simpleSorting;

    @Before
    public void setUp() {
        this.simpleSorting = new SimpleSorting();
    }

    @Test
    public void sortArray1() {
        int[] array = {2, 2, 8, 2, 2, 1, 1, 3, 1};
        int[] sortedArray = {1, 1, 1, 2, 2, 2, 2, 3, 8};
        assertArrayEquals(sortedArray, simpleSorting.sortArray(array, 1, array.length));
    }

    @Test
    public void sortArray2() {
        int[] array = {2, 1, 5, 5, 5, 8, 8, 8, 0, 0, 0, 7, 7, 7};
        int[] sortedArray = {0, 0, 0, 1, 2, 5, 5, 5, 7, 7, 7, 8, 8, 8};
        assertArrayEquals(sortedArray, simpleSorting.sortArray(array, 1, array.length));
    }

    @Test
    public void sortArray3() {
        int[] array = {5, 2, 4, 6, 1, 3, 2, 6};
        int[] sortedArray = {1, 2, 2, 3, 4, 5, 6, 6};
        assertArrayEquals(sortedArray, simpleSorting.sortArray(array, 1, array.length));
    }

    @Test
    public void sortArray4() {
        int[] array = {2, 2, 2, 2, 2, 1, 1, 1, 1};
        int[] sortedArray = {1, 1, 1, 1, 2, 2, 2, 2, 2};
        assertArrayEquals(sortedArray, simpleSorting.sortArray(array, 1, array.length));
    }

    @Test
    public void sortArray5() {
        int[] array = {2, 1};
        int[] sortedArray = {1, 2};
        assertArrayEquals(sortedArray, simpleSorting.sortArray(array, 1, array.length));
    }

    @Test
    public void sortArray6() {
        int[] array = {1};
        int[] sortedArray = {1};
        assertArrayEquals(sortedArray, simpleSorting.sortArray(array, 1, array.length));
    }

    @Test
    public void sortArray7() {
        int[] array = {7, 8, 9, 36, 4, 5, 5000001, 5000000, 0, 5, 6};
        int[] sortedArray = {7, 8, 9, 4, 5, 36, 5000000, 5000001, 0, 5, 6};
        assertArrayEquals(sortedArray, simpleSorting.sortArray(array, 4, 8));
    }

    @Test
    public void sortArray8() {
        int[] array = {4, 4, 4, 8, 7, 9, 6, 5, 48, 2};
        int[] sortedArray = {4, 4, 4, 8, 7, 9, 6, 5, 48, 2};
        assertArrayEquals(sortedArray, simpleSorting.sortArray(array, 5, 5));
    }
}