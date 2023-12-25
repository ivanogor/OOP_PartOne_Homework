public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int powerOfWitchcraft, int teleportDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfWitchcraft, teleportDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Имя студента - " + name + ". \nСила магии - " + powerOfWitchcraft + ". \nРасстояние трансгрессии - " + teleportDistance +
                ". \nХитрость - " + cunning + ". \nРешительность - " + determination + ". \nАмбициозность - " + ambition + ". \n" +
                "Находчивость - " + resourcefulness + ". \nЖажда власти - " + lustForPower + ". \n";
    }

    public static void compareTwoStudents(Slytherin firstStudent, Slytherin secondStudent){
        int sumOfFirstStudent = firstStudent.getCunning() + firstStudent.getDetermination() + firstStudent.getAmbition() +
                firstStudent.getResourcefulness() + firstStudent.getLustForPower();
        int sumOfSecondStudent = secondStudent.getCunning() + secondStudent.getDetermination() + secondStudent.getAmbition() +
                secondStudent.getResourcefulness() + secondStudent.getLustForPower();

        String result = sumOfFirstStudent > sumOfSecondStudent ? firstStudent.getName() + " лучший слизеринец, чем " + secondStudent.getName() + ". "
                : secondStudent.getName() + " лучший слизеринец, чем " + firstStudent.getName() + ". ";

        System.out.println(result);
    }
}
