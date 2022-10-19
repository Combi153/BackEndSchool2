package exercise.recursive;

public class Factorial {

    public int calc(int x) {
        System.out.println(x);
        if (x <= 1) {
            return x;
        } else{
            return calc(x - 1) * x;
        }
    }
}
