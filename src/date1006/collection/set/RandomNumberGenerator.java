package date1006.collection.set;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public int generate(int num) {
        return (int)(Math.random() * num);
    }
}
