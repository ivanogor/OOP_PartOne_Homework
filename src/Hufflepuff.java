public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int powerOfWitchcraft, int teleportDistance, int hardworking, int loyal, int honest) {
        super(name, powerOfWitchcraft, teleportDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Имя студента - " + name + ". \nСила магии - " + powerOfWitchcraft +
        ". \nРасстояние трансгрессии - " + teleportDistance + ". \nТрудолюбивость - " + hardworking + ". \nВерность - " + loyal +
        ". \nЧестность - " + honest + ". \n";
    }

    public static void compareTwoStudents(Hufflepuff firstStudent, Hufflepuff secondStudent){
        int sumOfFirstStudent = firstStudent.getHardworking() + firstStudent.getLoyal() + firstStudent.getHonest();
        int sumOfSecondStudent = secondStudent.getHardworking() + secondStudent.getLoyal() + secondStudent.getHonest();

        String result = sumOfFirstStudent > sumOfSecondStudent ? firstStudent.getName() + " лучший пуффендуец, чем " + secondStudent.getName() + ". "
                : secondStudent.getName() + " лучший пуффендуец, чем " + firstStudent.getName() + ". ";

        System.out.println(result);
    }
}
