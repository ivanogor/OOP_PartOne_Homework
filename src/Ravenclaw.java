public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, int powerOfWitchcraft, int teleportDistance, int smart, int wise, int witty, int creative) {
        super(name, powerOfWitchcraft, teleportDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "Имя студента - " + name + ". \nСила магии - " + powerOfWitchcraft + ". \nРасстояние трансгрессии - " + teleportDistance +
                ". \nУм - " + smart + ". \nМудрость - " + wise + ". \nОстроумие - " + witty + ". \nКреативность - " + creative + ". \n";
    }

    public static void compareTwoStudents(Ravenclaw firstStudent, Ravenclaw secondStudent){
        int sumOfFirstStudent = firstStudent.getSmart() + firstStudent.getWise() + firstStudent.getWitty() + firstStudent.getCreative();
        int sumOfSecondStudent = secondStudent.getSmart() + secondStudent.getWise() + secondStudent.getWitty() + secondStudent.getCreative();

        String result = sumOfFirstStudent > sumOfSecondStudent ? firstStudent.getName() + " лучший когтевранец, чем " +
                secondStudent.getName() + ". "
                : secondStudent.getName() + " лучший когтевранец, чем " + firstStudent.getName() + ". ";

        System.out.println(result);
    }
}
