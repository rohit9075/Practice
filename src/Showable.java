public interface Showable {

    void run();

    interface  Message{
        void message();
    }
}

class TestNestedInerface implements Showable.Message{

    @Override
    public void message() {
        System.out.println("hello nested interface");
    }

    public static void main(String[] args) {
        Showable.Message message = new TestNestedInerface();
        message.message();
    }
}
