package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
public class Test {
    public void teststudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s))
                System.out.println(s);
        }
    }
}
class Studentinfo{
    public static void main(String[] args) {
        ArrayList <String> array = new ArrayList<>();
        array.add("privet");
        array.add("poka");
        array.add("ok");
        array.add("Uchim Java");
        array.add("A Imenno Lambdas");
        array.removeIf(element -> element.length()>4);
        System.out.println(array);

        Student st1 = new Student("Ivan",'m',22,3,8.3);
        Student st2 = new Student("Nikolay",'m',28,2,6.4);
        Student st3 = new Student("Elena",'f',19,1,8.9);
        Student st4 = new Student("Petr",'m',35,4,7);
        Student st5 = new Student("Mariya",'f',23,3,9.1);
        ArrayList <Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Studentinfo inf = new Studentinfo();
        */
/*inf.teststudents(students, (Student s) -> {
            return s.age > 30;
        }); *//*
  //длинная форма написания
        //System.out.println("-------------------------------------");
        info.testStudents(students, s -> s.course > 2);                //самая короткая написания лямбда выражения!!!
        System.out.println("-------------------------------------");
        info.testStudents(students, s -> s.sex == 'f' && s.course > 2 && s.avgGrade < 9.5);
        System.out.println("-------------------------------------");
        StudentInfo.StudentChecks p = s -> s.age < 20;         // иниая форма написания
        info.testStudents(students, p);             // нежели выше указанных
        System.out.println("-------------------------------------");


    }
}
*/
