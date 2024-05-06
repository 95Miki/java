package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExampleLock {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.MobileCall();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.WhatsAppCall();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.SkypeCall();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
class Call {
    private Lock lock = new ReentrantLock();

    void MobileCall() {
        lock.lock();
        try {
            System.out.println("MobileCall start!!!");
            Thread.sleep(3000);
            System.out.println("MobileCall end!!!");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void WhatsAppCall() {
        lock.lock();
        try {
            System.out.println("WhatsAppCall starts!!!");
            Thread.sleep(4000);
            System.out.println("WhatsAppCall ends!!!");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void SkypeCall() {
        lock.lock();
        try {
            System.out.println("SkypeCall starts!!!");
            Thread.sleep(5000);
            System.out.println("SkypeCall ends!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
