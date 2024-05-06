package stream;

import java.util.ArrayList;

public class ParallelStream {
    public static void main(String[] args) {
        ArrayList <Double> arrayList = new ArrayList<>();
        arrayList.add(0.4);
        arrayList.add(12.1);
        arrayList.add(3.4);
        arrayList.add(5.9);

        double sumResult = arrayList.parallelStream().reduce((aDouble, aDouble2) -> aDouble + aDouble2).get();
        System.out.println("sum result ->"+sumResult);

        double quotientResult = arrayList.parallelStream().reduce((aDouble, aDouble2) -> aDouble / aDouble2).get();
        System.out.println("quotientResult ->"+quotientResult); // при делении параллелный стрим НЕ работает коректно!!!
    }
}
