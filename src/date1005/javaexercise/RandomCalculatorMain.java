package date1005.javaexercise;

public class RandomCalculatorMain {
    public static void main(String[] args) {
        RandomCalculator ranCalc = new RandomCalculator(10);
        System.out.println(ranCalc.add());
        System.out.println(ranCalc.sub());
        System.out.println(ranCalc.mul());
        System.out.println(ranCalc.div());
    }
}
