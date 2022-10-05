package date1005.calculator_interface;

import date1005.calculator.RandomCalculator;

public class CalculatorMain {
    public static void main(String[] args) {
        NumberCreator numberCreator = new RandomNumberCreator();
        Calculator randomCalculator = new Calculator(numberCreator);
        randomCalculator.plus(10);

        Calculator specificCalculator = new Calculator(new SpecificNumberCreator());
        specificCalculator.plus(10);
    }
}
