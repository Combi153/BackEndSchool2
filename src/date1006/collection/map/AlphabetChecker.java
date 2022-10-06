package date1006.collection.map;

public class AlphabetChecker {

    public boolean isCapital(char character) {
        System.out.println(character);
        int characterCode = character;
        if (characterCode >= 65 && characterCode <= 90){
            return true;
        }
        return false;
    }

    public boolean isAlphabet(char character) {
        int characterCode = character;
        if (characterCode >= 97 && characterCode <= 122){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        AlphabetChecker alphabetChecker = new AlphabetChecker();

        String s1 = "aabbccddefghijkkkkkllm";
        System.out.println(alphabetChecker.isCapital(s1.charAt(4)));
        System.out.println(alphabetChecker.isAlphabet(s1.charAt(4)));
    }
}
