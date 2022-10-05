package date1005.javaexercise;

public class RandomCalculator implements RandomNumberMaker{

    private int a;
    private int b;

    public RandomCalculator(int a){
        this.a = a;
        this.b = setRandomNumber();
    }

    @Override
    public int setRandomNumber() {
       return (int)(Math.random() * 10);
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
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        } else{
            return a / (double)b;
        }
    }
    public double div2(){
        try{
            if (b == 0){
                throw new ArithmeticException();
            }
            return a / (double) b;
        } catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
    }
}
