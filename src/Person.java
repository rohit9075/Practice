public abstract class Person {

    public abstract void run();
}

class TestAnonymous{
    public static void main(String[] args) {

        Person p = new Person() {
            @Override
            public void run() {
                System.out.println("Anonymous inner class");
            }
        };

        p.run();
    }
}
