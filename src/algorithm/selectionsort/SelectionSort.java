package algorithm.selectionsort;

import algorithm.bubblesort.BubbleSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SelectionSort {
    public int[] selectionSort(int[] array) {
        int indexMin;
        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            indexMin = i;
            for (int j = i + 1 ; j < array.length; j++) {
                if (array[j] < array[indexMin]) {
                    indexMin = j;
                }
            }
            temp = array[indexMin];
            array[indexMin] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SelectionSort sorter = new SelectionSort();
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(sorter.selectionSort(numbers)));
    }
}
