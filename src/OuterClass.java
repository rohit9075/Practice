import java.util.ArrayList;
import java.util.List;

abstract class OuterClass {
    abstract void eat();
}

class TestAnonymousInner{

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass() {
            @Override
            void eat() {
                System.out.println("TestAnonymousInner");
            }
        };
        outerClass.eat();
    }

    List<String > list = new ArrayList<>();

}

