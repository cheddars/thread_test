package ex1;

public class ThreadByImplements implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args){
        Thread t = new Thread(new ThreadByImplements());
        t.start();
    }
}
