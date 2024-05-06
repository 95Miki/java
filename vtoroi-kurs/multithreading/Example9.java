package multithreading;

public class Example9 {
    static final Object lock = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsapp());
        thread1.start();
        thread2.start();
        thread3.start();
    }

    void mobileCall(){
        synchronized (lock){     //  synchronized blocks
            System.out.println("Mobile call starts!!!");
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Mobile call ends!!!");
        }

    }
    void skypeCall(){
        synchronized (lock){
            System.out.println("Skype call starts!!!");
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Skype call ends!!!");
        }

    }
    void whatsappCall(){
        synchronized (lock){
            System.out.println("Whatsapp call starts!!!");
            try {
                Thread.sleep(7000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Whatsapp call ends!!!");
        }

    }
}
class RunnableImplMobile implements Runnable{
    public void run(){
        new Example9().mobileCall();
    }
}
class RunnableImplSkype implements Runnable{
    public void run(){
        new Example9().skypeCall();
    }
}
class RunnableImplWhatsapp implements Runnable{
    public void run(){
        new Example9().whatsappCall();
    }
}