package algorithm.bubblesort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1 ; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    System.out.println(Arrays.toString(array));
                }
            }
            System.out.println();
        }

        return array;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BubbleSort bs = new BubbleSort();
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(bs.sort(numbers)));
    }
}
