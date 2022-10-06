package date1006.collection.set.ex3_alphabet;

public class RandomAlphabetGenerator implements AlphabetGenerator{
    @Override
    public char generateAlphabet() {
        return (char)((int)(Math.random() * 26) + 65);
    }
}
