package multithreading;

public class Example3{
    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        myThread3.setName("moy_potok");  // default name Thread-0
        myThread3.setPriority(myThread3.MAX_PRIORITY); //или назначить число int
                                                       // default priority norm priority or 5;
        MyThread3 myThread31 = new MyThread3();
        System.out.println("potok 1: "+myThread3.getName()+"/ " +myThread3.getPriority()+"/potok 2: "+myThread31.getName()
        +"/" +myThread31.getPriority());
    }
}
class MyThread3 extends Thread{
    @Override
    public void run() {
        System.out.println("privet");
    }
}