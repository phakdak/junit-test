import org.junit.jupiter.api.function.Executable;

import java.util.stream.DoubleStream;

public class test {
    static int divide(int num1, int num2){
        int sum =0;
        try {
                sum = num1/num2;

        }catch (Exception exception){
            System.out.println("Can't divide by zero!");

        }
        return sum;
    }
    static int sum(int num1, int num2){
        int sum =0;
        try {
            sum = num1+num2;
        }catch (Exception exception){
            System.out.println("Can't divide by zero!");

        }
        return sum;
    }
    static int multiply(int num1, int num2){
        int sum =0;
        try {
            sum = num1*num2;
        }catch (Exception exception){
            System.out.println("Can't divide by zero!");

        }
        return sum;
    }
    static int substract(int num1, int num2){
        int sum =0;
        try {
            sum = num1-num2;
        }catch (Exception exception){
            System.out.println("Can't divide by zero!");

        }
        return sum;
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int sum = 0;
        sum = sum(num1,num2);
        System.out.println("sum = " + sum);
        sum = divide(num1,num2);
        System.out.println("sum = " + sum);
        sum = multiply(num1,num2);
        System.out.println("sum = " + sum);
        sum = substract(num1,num2);
        System.out.println("sum = " + sum);
    }
}



