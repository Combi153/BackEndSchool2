package date1005.calculator_interface;

public class Calculator {

   private NumberCreator numberCreator;

    public Calculator(NumberCreator numberCreator) {
        this.numberCreator = numberCreator;
    }

    public void plus(int num) {
        System.out.println(num + numberCreator.createNumber(10));
    }
}
