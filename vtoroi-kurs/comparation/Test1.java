package comparation;

import java.util.ArrayList;
import java.lang.System;
import java.util.Collections;
import static java.util.Collections.sort;


public class Test1 {
    public static  void main(String[] args) {
        ArrayList <Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov",1235);
        Employee emp2 = new Employee(15, "Ivan", "Petrov",5462);
        Employee emp3 = new Employee(123, "Ivan", "Polotov",85643);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("До сортировки: "+list);
        sort(list);
        System.out.println("После Сортировки"+list);



    }
}

class Employee implements Comparable <Employee>{
    int id;
    String name;
    String surname;
    double salary;

    public Employee(int id, String name, String surname, double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @java.lang.Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @java.lang.Override
    public int compareTo(Employee anotherEmp) {
//        if(this.id == anotherEmp.id){
//        return 0;
//    } else if (this.id < anotherEmp.id) {
//            return -1;
//        }else {
//            return 1;
//    }
        return this.id - anotherEmp.id;

        }
            

    }