public class Palindrom {

    public static void main(String[] args) {

        String str = "aaaa";
        String reverse;

        int lenght = str.length();

        char arr[] = new char[10];
        int j = 0;

        for (int i = lenght- 1 ; i >= 0 ; i--) {

           arr[j]  = str.charAt(i);
           j++;
        }


        if (arr.toString() == str){
            System.out.println("given string is palindrom");
        }else {
            System.out.println("Given string is not a palindrom");
        }
    }
}
