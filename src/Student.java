public interface Student {

    void run();
}

class TestAnonymousInner{

   private static int a = 10;

    public static void main(String[] args) {
        Student st = new Student() {
            @Override
            public void run() {
                System.out.println("TestAnonumousInner using Interface and global variable value is : " + a);
            }
        };

        st.run();
    }
}
