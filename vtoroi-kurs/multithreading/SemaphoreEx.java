package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Janul",callBox);
        new Person("Unus",callBox);
        new Person("Miki",callBox);
        new Person("Zaur",callBox);
        new Person("Petr",callBox);

    }
}
class Person extends Thread{
    String name;
    private Semaphore callBox;
    public Person(String name,Semaphore callBox){
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name+" ждет...");
            callBox.acquire();
            System.out.println(name+" пользуется телефоном");
            sleep(1500);
            System.out.println(name+" завершил(а) звонок");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBox.release();
        }
    }
}