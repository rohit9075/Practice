package method_overloading;

public class Calculator {

    public int add(int a, int b){
        return a+b;
    }

    public void add(int a, int b , int c){

        int sum = a+b+c;

        System.out.println("sum is : " + sum);

    }

    public long add(int a, int b , long c){
        return a+b+c;
    }

    public long add(int a, long b , int c){
        return a+b+c;
    }


    public int add(int a, int b , int c, int d){
        return a+b+c+d;
    }


}
