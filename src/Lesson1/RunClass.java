package Lesson1;

public class RunClass {

    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Person("имя1", 100);
        person[1] = new Person("имя2", 200);
        person[2] = new Person("имя3", 300);
        person[3] = new Person("имя4", 400);
        Team team = new Team("группа1", person);

        Course course = new Course(250,350,410);
        String result = course.doIt(team);
        System.out.println(result);

    }
}


