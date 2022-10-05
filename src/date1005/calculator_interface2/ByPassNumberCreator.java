package date1005.calculator_interface2;

public class ByPassNumberCreator implements NumberCreator{
    @Override
    public int createNumber(int num) {
        return num;
    }
}
