package multithreading;

public class Example5 {
    public static void main(String[] args) throws InterruptedException{
        for (int i = 5; i>0; i--) {
            System.out.println(i);
            Thread.sleep(1500);//1500 миллисекунд
        }
        System.out.println("Go!!!");
    }
}
