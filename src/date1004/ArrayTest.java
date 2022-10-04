package backend1004;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("Hello world");

        //10 칸의 int array를 만들고
        // 1부터 10까지 채우고, console에 출력

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println(Arrays.toString(array));

    }
}
