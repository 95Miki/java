package multithreading;

public class WaitNotifyExample {
    public static void main(String[] args) {
        Market market = new Market();
        Thread thread1 = new Thread(new Producer(market));
        Thread thread2 = new Thread(new Consumer(market));
        thread1.start();
        thread2.start();

    }
}

class Market{
    private int breadCount = 0;

    public synchronized void getBread(){
        while (breadCount<1){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount--;
        System.out.println("Потребитель купил 1 хлеб");
        System.out.println("Количество в магазине хлеба: "+breadCount);
        notify();
    }
    public synchronized void putBread(){
        while (breadCount>=5){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount++;
        System.out.println("Производитель добавил 1 хлеб");
        System.out.println("Количество в магазине хлеба: "+breadCount);
        notify();
    }
}
class Producer implements Runnable{
    Market market;
    Producer(Market market){
        this.market=market;
    }

    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            market.putBread();
        }
    }
}
class Consumer implements Runnable{
    Market market;
    Consumer(Market market){
        this.market=market;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            market.getBread();
        }
    }
}
