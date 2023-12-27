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
        return super.toString() + "Благородств - " + nobility + ". \nЧесть - " + honor + ". \nХрабрость - " + bravery + ". \n";
    }

    public void compareTo(Gryffindor anotherStudent){
        int sumOfFirstStudent = this.getBravery() + this.getHonor() + this.getNobility();
        int sumOfSecondStudent = anotherStudent.getBravery() + anotherStudent.getHonor() + anotherStudent.getNobility();

        String result = sumOfFirstStudent > sumOfSecondStudent ? this.getName() + " лучший гриффиндорец, чем " + anotherStudent.getName() + ". "
                : anotherStudent.getName() + " лучший гриффиндорец, чем " + this.getName() + ". ";

        System.out.println(result);
    }
}
