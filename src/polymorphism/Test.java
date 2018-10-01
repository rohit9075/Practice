package polymorphism;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter bank name: ");

        String bankName = input.next();



        Bank obj = Utils.getObject(bankName);

        System.out.println(obj.ROI());
    }


}
