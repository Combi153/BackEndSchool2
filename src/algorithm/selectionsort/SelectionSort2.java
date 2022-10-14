package algorithm.selectionsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SelectionSort2 {

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
        List<Integer> array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        SelectionSort2 sorter = new SelectionSort2();
        System.out.println(sorter.sort(array));
    }
}
