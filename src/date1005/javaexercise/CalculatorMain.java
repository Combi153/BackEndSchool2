package date1005.javaexercise;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 5));
        System.out.println(calc.sub(10, 5));
        System.out.println(calc.mul(10, 5));
        System.out.println(calc.div(10, 5));
    }
}
