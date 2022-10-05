package date1005.calculator_interface;

public class SpecificNumberCreator implements NumberCreator{
    @Override
    public int createNumber(int num) {
        return 1000 * num;
    }
}
