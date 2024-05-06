package generics.game;

public class Test {
    public static void main(String[] args) {
        Scoolar schoolar1 = new Scoolar("Ivan",13);
        Scoolar schoolar2 = new Scoolar("Maria",15);

        Scoolar schoolar3 = new Scoolar("Mike",14);
        Scoolar schoolar4 = new Scoolar("Jone",12);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Ksenia",18);

        Employee employee1 = new Employee("Zaur",32);
        Employee employee2 = new Employee("Mikhail",42);

        Team<Scoolar> schoolarTeam = new Team<>("Drakony");
        Team<Student> studentTeam = new Team<>("Vpered");
        Team<Employee> employeeTeam = new Team<>("Robotiagi");
        Team<Scoolar> schoolarTeam2 = new Team<>("Mudritsy");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);

    }
}
