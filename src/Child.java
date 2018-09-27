public class Child extends Parent {

    @Override
    public void print() {
        super.print();
//        System.out.println("I am printing from child");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.print();
    }
}
