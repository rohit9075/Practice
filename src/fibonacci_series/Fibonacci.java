package fibonacci_series;

import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {
        System.out.println("Enter the number");
        int number;
        number = new Scanner(System.in).nextInt();

        Fibonacci fib = new Fibonacci();

        for (int i = 1; i <= number ; i++) {

            System.out.println("fibonacci number is : " + fib.fibonacci2(i));

        }


    }

    // printing fibonacci using recursion
    private int fibonacci(int number){

        if (number == 1 || number == 2 ){
            return 1;
        }
        return fibonacci(number -1 ) + fibonacci(number -2 );
    }


    // printing fibonacci using for loop

    private int fibonacci2(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci = 1;
        for(int i= 3; i<= number; i++){

            //fibonacci_series.Fibonacci number is sum of previous two fibonacci_series.Fibonacci number
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci; //fibonacci_series.Fibonacci number

    }
}
