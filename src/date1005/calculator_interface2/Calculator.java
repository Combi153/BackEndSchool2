package date1005.calculator_interface2;

public class Calculator {

    NumberCreator numberCreator;
    private int baseNumber;

    public Calculator(NumberCreator numberCreator) {
        this.numberCreator = numberCreator;
        this.baseNumber = 10;
    }

    public Calculator(NumberCreator numberCreator, int baseNumber) {
        this.numberCreator = numberCreator;
        this.baseNumber = baseNumber;
    }

    public void add(int num){
        System.out.println(num + numberCreator.createNumber(baseNumber));
    }
}
