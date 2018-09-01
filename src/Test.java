import java.util.Scanner;

public class Test {

    // finding the digits in the number

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit = 0;

        System.out.println("Please enter the number to find the digit : ");
        int number = input.nextInt();

        while (number != 0){

            digit++;
            number = number/10;
        }

        System.out.println(digit);
    }

}

