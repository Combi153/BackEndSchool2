package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class No1443SelectionSort {
    public List<Integer> sort(List<Integer> array){

        int minIdx;
        int temp;

        for (int i = 0; i < array.size() - 1; i++) {
            minIdx = i;
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(j) < array.get(minIdx)) {
                    minIdx = j;
                }
            }
            temp = array.get(minIdx);
            array.set(minIdx, array.get(i));
            array.set(i, temp);
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> array = new ArrayList<>();
        No1443SelectionSort sorter = new No1443SelectionSort();
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++){
            array.add(Integer.parseInt(br.readLine()));
        }
        array = sorter.sort(array);
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
