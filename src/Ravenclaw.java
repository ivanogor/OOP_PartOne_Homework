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
        return super.toString() + "Ум - " + smart + ". \nМудрость - " + wise + ". \nОстроумие - " + witty + ". \nКреативность - " + creative + ". \n";
    }

    public void compareTo(Ravenclaw anotherStudent){
        int sumOfFirstStudent = this.getSmart() + this.getWise() + this.getWitty() + this.getCreative();
        int sumOfSecondStudent = anotherStudent.getSmart() + anotherStudent.getWise() + anotherStudent.getWitty() + anotherStudent.getCreative();

        String result = sumOfFirstStudent > sumOfSecondStudent ? this.getName() + " лучший когтевранец, чем " +
                anotherStudent.getName() + ". "
                : anotherStudent.getName() + " лучший когтевранец, чем " + this.getName() + ". ";

        System.out.println(result);
    }
}
