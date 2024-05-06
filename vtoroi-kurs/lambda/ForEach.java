package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForEach {
    private Comparator<? super Integer> el;

    public static void main(String[] args) {
       /* List <String> list = List.of("privet","poka","kak dela?","horosho!!!");
        for(String s : list){
            System.out.println(s);
        }
        list.forEach(str -> System.out.println(str));*/

        List <Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(2);
        list1.add(6);
        list1.add(7);
        list1.add(3);
        list1.forEach(el -> System.out.println(el));
    }
}
