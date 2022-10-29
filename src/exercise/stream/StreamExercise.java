package exercise.stream;

import java.util.stream.Collectors;

public class StreamExercise {
    public static int getLove(int character) {
        if (character <= 90 && character >= 65){
            return 65 + (90 - character);
        } else if (97 <= character && character <= 122) {
            return 97 + (122 - character);
        }
        return character;
    }

    public static void main(String[] args) {
        String sentence = "I love you";
        String str = sentence.chars()
                .map(StreamExercise::getLove)
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
        System.out.println(str);
    }
}
