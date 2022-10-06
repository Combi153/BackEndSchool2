package date1006.collection.map;

import java.util.HashMap;

public class AlphabetChecker {

    public boolean isAlphabet(char character) {
        if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        AlphabetChecker alphabetChecker = new AlphabetChecker();
        HashMap<Character, Integer> alphabetMap = new HashMap<>();

        for (char c = 'A'; c <= 'Z'; c++) { //공간복잡도가 높을 것 같다.
            alphabetMap.put(c, 0);
        }

        String s1 = "aa..bbcc//ddefg1123hijkk123aAAsdfakkk.llm".toUpperCase();

        for (int i = 0; i < s1.length(); i++){
            char character = s1.charAt(i);
            boolean isAlphabet = alphabetChecker.isAlphabet(character);
            if (isAlphabet){
                alphabetMap.put(character, alphabetMap.get(character) + 1);
            }
        }
        System.out.println(alphabetMap);
    }
}
