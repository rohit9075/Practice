import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = scan.nextLine();

        System.out.println("Please enter three digit number");
        int num = scan.nextInt();

        System.out.printf("%-15s%05d",name,num);
    }
}
