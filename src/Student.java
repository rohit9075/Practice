import java.util.Scanner;

public  class Student {

    public static void main(String args[])
    {
        int n, sum = 0, temp, remainder, digits = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number to check if it is an Armstrong number");
        n = in.nextInt();

        temp = n;

        // Count number of digits

        digits = digitCount(temp, digits);

        temp = n;

        sum = armstrong(sum, temp, digits);

        printOutpur(n, sum);
    }

    private static void printOutpur(int n, int sum) {
        if (n == sum)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " isn't an Armstrong number.");
    }

    private static int armstrong(int sum, int temp, int digits) {
        int remainder;
        while (temp != 0) {
            remainder = temp%10;
            sum = sum + power(remainder, digits);
            temp = temp/10;
        }
        return sum;
    }

    private static int digitCount(int temp, int digits) {
        while (temp != 0) {
            digits++;
            temp = temp/10;
        }
        return digits;
    }

    static int power(int reminder, int digits) {
        int c, p = 1;

        for (c = 1; c <= digits; c++)
            p = p*reminder;

        return p;
    }
}
