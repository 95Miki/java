package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("Zaur");
        arrayList.add("Maria");
        arrayList.add("Beka");
        arrayList.add("Samat");
        arrayList.add("Manas");
        arrayList.add("Nikolay");

        Iterator <String> iterator = arrayList.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
