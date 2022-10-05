package date1005.calculator_interface;

public class RandomNumberCreator implements NumberCreator{
    @Override
    public int createNumber(int num) {
        return (int)(Math.random() * num);
    }
}
