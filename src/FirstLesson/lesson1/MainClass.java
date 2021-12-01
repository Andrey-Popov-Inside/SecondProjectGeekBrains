package FirstLesson.lesson1;

import FirstLesson.lesson1.Competitors.*;
import FirstLesson.lesson1.obstacles.*;

public class MainClass {
    public static void main(String[] args) {

        Competitor[] competitors = {new Human("Инокентий"), new Cat("Феликс"), new Dog("Хатико"),new Snake("Нагайна")};
        Obstacle[] obstacles = {new Cross(400), new Wall(2), new Water(1)};

        Team team = new Team("КучаМала", competitors);

        System.out.println("============Создание новой команды============");
        System.out.println(team.getTeamName());

        System.out.println("============Физкульт ПРИВЕТ!============");
        team.showResults();

        Course course = new Course(obstacles);

        System.out.println("============Команда начинает прохождение============");
        course.doIt(team);

        System.out.println("============ Результаты команды ============");
        team.showResults();

        System.out.println("============ Те кто справился с Веселыми стартами!============");
        team.showMembersFinishedCourse();
    }
}