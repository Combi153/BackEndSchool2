package date1006.collection.set.ex3_alphabet;

import java.util.HashSet;
import java.util.Set;

public class RndAlphabetWithoutDuplicated {
    public static void main(String[] args) {
        RandomAlphabetGenerator randomAlphabetGenerator = new RandomAlphabetGenerator();
        Set<Character> alphabets = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            alphabets.add(randomAlphabetGenerator.generateAlphabet());
        }
        System.out.println(alphabets);
        System.out.println(alphabets.size());
    }
}
