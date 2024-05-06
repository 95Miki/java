package generics;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        List <?> list = new ArrayList<>();// добавлять сюда НЕЛЬЗЯ!!! эта строка относиться к методу showListInfo
        //list.add(215); компелятор выдаст ощибку!
        // знак <?> называется Wildcard
        List <Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(512.2);
        doubleList.add(0.1234);
        showListInfo(doubleList);
        List <String> stringList = new ArrayList<>();
        stringList.add("privet");
        stringList.add("poka");
        stringList.add("hello!!!");
        showListInfo(stringList);
}
public static void showListInfo(List<?>list){
    System.out.println("Moy list soderjit sled elementy: " +list);
    }
}