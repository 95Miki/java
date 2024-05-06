package multithreading;

public class Example4 implements Runnable {
    @Override
    public void run() {
        System.out.println("Method run. Thread Name = "+Thread.currentThread().getName() );
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Example4());
        thread.start();// если вместо start(); исп-ть run(); не запуститься новый поток!!!
                        // так делать Нельзя!!!
        System.out.println("Method main. Thread Name = "+Thread.currentThread().getName());
    }
}
