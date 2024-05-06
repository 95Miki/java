package multithreading;

import java.util.TreeMap;

public class Example6 extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ " "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(new MyRunnable());
        Example6 thread2 = new Example6();
        thread.start();
        thread2.start();

        thread.join();   // после написания join main будет ждать окончание работы потоков!!!
        thread2.join();
        System.out.println("END!!!");

    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}