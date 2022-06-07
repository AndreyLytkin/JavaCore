package Lesson1;

public class Course {

    String result;
    private int distance1;
    private int distance2;
    private int distance3;


    public Course(int distance1, int distance2, int distance3) {
        this.distance1 = distance1;
        this.distance2 = distance2;
        this.distance3 = distance3;
    }

    public String doIt(Team team){
        result = "Команда номер: "+ team.getName()+ " " + '\n';
        for(Person person: team.getPeoples()){
            result += "имя члена команды: " + person.getName()+ " " + '\n';
            int value = person.getRunningSpeed();
            testDistance1(value);
            testDistance2(value);
            testDistance3(value);

        }

        return result;
    }

    private void testDistance1(int value){
        if(value<distance1) result += " Дистанция 1 пройдена "+ '\n';

    }

    private void testDistance2(int value){
        if(value<distance2 + 50) result += " Дистанция 2 пройдена "+ '\n';

    }

    private void testDistance3(int value){
        if(value<distance3 - 100) result += " Дистанция 3 пройдена "+ '\n';

    }

}
