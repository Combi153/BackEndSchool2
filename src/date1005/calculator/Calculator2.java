package date1005.calculator;

public class Calculator2 {
    private final int ERROR = -99999999;
    private int a;
    private int b;

    public Calculator2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(){
        return a + b;
    }
    public int sub(){
        return a - b;
    }
    public int mul(){
        return a * b;
    }
    public double div(){
        if(b == 0){
            return ERROR;
        } else{
            return a / (double)b;
        }
    }
}
