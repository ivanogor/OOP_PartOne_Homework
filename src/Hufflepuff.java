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
        return super.toString() + "Трудолюбивость - " + hardworking + ". \nВерность - " + loyal +
        ". \nЧестность - " + honest + ". \n";
    }
    public void compareTo(Hufflepuff anotherStudent){
        int sumOfFirstStudent = this.getHardworking() + this.getLoyal() + this.getHonest();
        int sumOfSecondStudent = anotherStudent.getHardworking() + anotherStudent.getLoyal() + anotherStudent.getHonest();

        String result = sumOfFirstStudent > sumOfSecondStudent ? this.getName() + " лучший пуффендуец, чем "  + anotherStudent.getName() + ". "
                : anotherStudent.getName() + " лучший пуффендуец, чем " + this.getName() + ". ";

        System.out.println(result);
    }
}
