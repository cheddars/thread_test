package ex2;

public class ThreadUnPredictable extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        ThreadUnPredictable thread = new ThreadUnPredictable();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
}

