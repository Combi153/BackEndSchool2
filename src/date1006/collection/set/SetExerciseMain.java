package date1006.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExerciseMain {
    public static void main(String[] args) {
        // 1. set은 중복을 허용하지 않는다.
        Set<String> set1 = new HashSet<>(); // treeset 도 있다.
        set1.add("주찬민");
        set1.add("주찬민");
        set1.add("김주찬");

        System.out.println(set1);

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(3);

        System.out.println(setInteger);


    }
}
