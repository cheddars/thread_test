package ex1;

public class ThreadRunnerInterface {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++) {
            Thread t = new Thread(new ThreadByImplement());
            t.start();
        }
    }
}

class ThreadByImplement implements Runnable {
    @Override
    public void run(){
        System.out.println("Hello World " + Thread.currentThread().getName());
    }
}
