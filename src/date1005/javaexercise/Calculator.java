package date1005.javaexercise;

public class Calculator {
    private final int ERROR = -99999999;

    public Calculator() {}

    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public int mul(int a, int b){
        return a * b;
    }
    public double div(int a, int b){
        if(b == 0){
            return ERROR;
        } else{
            return a / (double)b;
        }
    }
}
