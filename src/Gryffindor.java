public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerOfWitchcraft, int teleportDistance, int nobility, int honor, int bravery) {
        super(name, powerOfWitchcraft, teleportDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Имя студента - " + name + ". \nСила магии - " + powerOfWitchcraft + ". \nРасстояние трансгрессии - " + teleportDistance +
                ". \nБлагородств - " + nobility + ". \nЧесть - " + honor + ". \nХрабрость - " + bravery + ". \n";
    }

    public static void compareTwoStudents(Gryffindor firstStudent, Gryffindor secondStudent){
        int sumOfFirstStudent = firstStudent.getBravery() + firstStudent.getHonor() + firstStudent.getNobility();
        int sumOfSecondStudent = secondStudent.getBravery() + secondStudent.getHonor() + secondStudent.getNobility();

        String result = sumOfFirstStudent > sumOfSecondStudent ? firstStudent.getName() + " лучший гриффиндорец, чем " + secondStudent.getName() + ". "
                : secondStudent.getName() + " лучший гриффиндорец, чем " + firstStudent.getName() + ". ";

        System.out.println(result);
    }
}
