package backend1004.multiple;

import java.util.Scanner;

class MultipleChecker{

    private int num;
    private int multiplier;

    public MultipleChecker(int num, int multiplier){
        this.num = num;
        this.multiplier = multiplier;
    }

    public boolean isMultiple(){
        return num % multiplier == 0;
    }

    public void printMultipleStatement(){
        if (isMultiple()) {
            System.out.println("multiple");
        } else{
            System.out.println("not multiple");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        MultipleChecker isMultiple = new MultipleChecker(num, 7);
        isMultiple.printMultipleStatement();
    }
}
