package date1006.collection.set.ex2_randomnumber;

import java.util.HashSet;
import java.util.Set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Integer> randomNumberSet = new HashSet<>();

        for (int i = 0; i < 50; i++){
            randomNumberSet.add(randomNumberGenerator.generate(100));
        }
        System.out.println(randomNumberSet);
        System.out.println("집합 사이즈 : " + randomNumberSet.size());

    }
}
