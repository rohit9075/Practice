public class Test {

    public Test() {
        System.out.println("printing from the constructor");
    }

    public static void main(String[] args) {

        Test obj = new Test();



        String name;

        {
            name = "ABC";
            System.out.println("printing from the initializer block");
        }

        System.out.println("Name is : " + name);

    }

}
