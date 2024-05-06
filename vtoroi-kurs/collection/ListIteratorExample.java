package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch: s.toCharArray()){
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reversIterator = list.listIterator(list.size());
        boolean isPolindrom = true;
        while (iterator.hasNext() && reversIterator.hasPrevious()){
            if (iterator.next() !=reversIterator.previous()){
                isPolindrom = false;
                break;
            }
        }
        if (isPolindrom){
            System.out.println("Polindrom");
        }else {
            System.out.println("NOT Polindrom");
        }

    }
}
