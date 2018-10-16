package method_overridding;

public class Child extends Parent {

    @Override
    public void showName() {
        super.showName();

        System.out.println("I am printing from the child");

    }

    public static void main(String[] args) {
        Child child = new Child();
        child.showName();
    }
}
