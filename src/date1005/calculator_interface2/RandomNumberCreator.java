package date1005.calculator_interface2;

public class RandomNumberCreator implements NumberCreator{
    @Override
    public int createNumber(int num) {
        return (int)(Math.random() * num);
    }
}
