package collection.map_interfase;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double,Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur","Tregulov",3);
        Student st2 = new Student("Maria","Ivanovna",1);
        Student st3 = new Student("Ivan","Ivanov",4);
        Student st4 = new Student("Mike","John",3);
        Student st5 = new Student("Milena","Sidorova",5);
        Student st6 = new Student("Kolya","Sopuev",4);
        treeMap.put(9.1,st1);
        treeMap.put(5.4,st2);
        treeMap.put(6.3,st3);
        treeMap.put(8.5,st4);
        treeMap.put(6.9,st5);
        treeMap.put(9.9,st6);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(9.0));
        treeMap.remove(9.1);

    }
}
