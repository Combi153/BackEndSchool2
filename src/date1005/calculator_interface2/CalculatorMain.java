package date1005.calculator_interface2;

public class CalculatorMain {
    public static void main(String[] args) {
        NumberCreator randomNumberCreator = new RandomNumberCreator();
        Calculator random10Calc = new Calculator(randomNumberCreator);
        random10Calc.add(10);
        Calculator random100Calc = new Calculator(randomNumberCreator, 100);
        random100Calc.add(5);

        NumberCreator byPassNumberCreator = new ByPassNumberCreator();
        Calculator pass10Calc = new Calculator(byPassNumberCreator);
        pass10Calc.add(3);
    }
}
