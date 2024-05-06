package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);



        StudentInfo info = new StudentInfo();
        info.testStudents(students, (Student s) -> {
            return s.age > 30;
        });   //длинная форма написания
        System.out.println("-------------------------------------");
        info.testStudents(students, s -> s.course > 2);                //самая короткая написания лямбда выражения!!!
        System.out.println("-------------------------------------");
        info.testStudents(students, s -> s.sex == 'f' && s.course > 2 && s.avgGrade < 9.5);
        System.out.println("-------------------------------------");
       // StudentChecks p = s -> s.age < 20;         // иниая форма написания
        //info.testStudents(students, p);             // нежели выше указанных
        System.out.println("-------------------------------------");

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.age-o2.age;
//            }
//        });
//        System.out.println(students);

        students.sort((stud1, stud2) -> stud1.course - stud2.course);
        System.out.println(students);

        double res = avgOfSmth(students,student -> student.avgGrade);
        System.out.println(res);          //исп Function

    }

    private static double avgOfSmth(List<Student> list, Function<Student,Double> f){
        double result = 0;
        for (Student st : list){
            result += f.apply(st);
        }
        result = result/ list.size();
        return result;
    }

    void testStudents(ArrayList<Student> al, Predicate<Student> sc) {
        for (Student s : al) {
            if (sc.test(s)) {                                          // тут мы используем Predicate вместо ниже
                System.out.println(s);                                 // указанного интерфейса
            }
        }

    }

//    interface StudentChecks {
//        boolean checks(Student s);
//    }
}