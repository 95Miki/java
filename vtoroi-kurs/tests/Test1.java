package tests;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Test1 m = new Test1();
        m.car(12,31);

    }

public void car(int a, int b){
        if(a==b){
            System.out.println("Done!");
        }else {
            System.out.println("Not done!");
        }
}
}