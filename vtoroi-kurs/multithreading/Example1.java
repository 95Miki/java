package multithreading;

public class Example1 {
    public static void main(String[] args) {
        MyTread1 myTread1 = new MyTread1();
        MyTread2 myTread2 = new MyTread2();
        myTread1.start();// первый поток
        myTread2.start(); //второй поток

    }
}
class MyTread1 extends Thread{
    public void run(){
        for (int i = 1;i<100;i++)
            System.out.println(i);
    }

}
class MyTread2 extends Thread{
    public void run(){
        for (int i = 100; i>1;i--)
            System.out.println(i);
    }
}
