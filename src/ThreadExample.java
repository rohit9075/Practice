public class ThreadExample extends Thread {

    public void run(){
        for(int i=1;i<5;i++){
            try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        ThreadExample t1=new ThreadExample();
        ThreadExample t2=new ThreadExample();

        t1.start();
        t2.start();
    }
}
