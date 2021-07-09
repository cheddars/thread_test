package ex1;


public class ThreadRunner {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++) {
            ThreadByExtends t = new ThreadByExtends();
            t.start();
        }
    }
}

class ThreadByExtends extends Thread {
    @Override
    public void run(){
        System.out.println("Hello World getName()" + getName());
        System.out.println("Hello World Thread.getName()" + Thread.currentThread().getName());
    }
}