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
        return super.toString() + "Хитрость - " + cunning + ". \nРешительность - " + determination + ". \nАмбициозность - " + ambition + ". \n" +
                "Находчивость - " + resourcefulness + ". \nЖажда власти - " + lustForPower + ". \n";
    }

    public void compareTo(Slytherin anotherStudent){
        int sumOfFirstStudent = this.getCunning() + this.getDetermination() + this.getAmbition() +
                this.getResourcefulness() + this.getLustForPower();
        int sumOfSecondStudent = anotherStudent.getCunning() + anotherStudent.getDetermination() + anotherStudent.getAmbition() +
                anotherStudent.getResourcefulness() + anotherStudent.getLustForPower();

        String result = sumOfFirstStudent > sumOfSecondStudent ? this.getName() + " лучший слизеринец, чем " + anotherStudent.getName() + ". "
                : anotherStudent.getName() + " лучший слизеринец, чем " + this.getName() + ". ";

        System.out.println(result);
    }
}
