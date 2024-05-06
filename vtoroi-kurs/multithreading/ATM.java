package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Zaur", lock);
        new Employee("Janyl", lock);
        new Employee("Unus", lock);
        Thread.sleep(1000);
        new Employee("Miki", lock);
        new Employee("Arapbay", lock);
        new Employee("Samat", lock);

    }
}

class Employee extends Thread {
    String name;
    Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        /*System.out.println(name+" ждет...");
        lock.lock();*/
        if (lock.tryLock()) {
            System.out.println(name + " пользуется банкоматом");
            try {
                Thread.sleep(900);
                System.out.println(name + " завершил (а) работу банкоматом");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name+" не хочет ждать и ушел искат другой банкомат)");
        }
    }
}
