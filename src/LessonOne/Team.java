package LessonOne;

public class Team {
    private String teamName;

    public Runner[] runners = {new Runner("Noob-Saibot"), new Runner("Scorpion"),
            new Runner("Ermac"), new Runner("Reptile")};

    public Team(String teamName){
        this.teamName = teamName;

    }

    public void membersName (){
        System.out.println("Команда " + this.teamName + " Члены команды:");
        for (int i = 0; i < runners.length; i++)
            System.out.println(runners[i]);

    }
    public void showResults(){
        for (Runner courRunner:runners){
            System.out.println(courRunner.getRunnerName() + ": " + courRunner.getTime());
        }
    }


}
