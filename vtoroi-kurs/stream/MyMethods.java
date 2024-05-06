package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MyMethods {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(9);
        list.add(7);
        list.add(8);
        list.add(2);
         int result = list.stream().reduce((accum,el) -> (accum + el)*2 ).get();
        System.out.println(result);

        List <Integer> list1 = new ArrayList<>();
        list1.add(345);
        list1.add(146);
        Optional<Integer> o = list1.stream().reduce((accum, el)->accum%el);
        if (o.isPresent()){
            System.out.println(o.get());
        }else {
            System.out.println("Not present");
        }
    }
}
