abstract public class Hogwarts {
    protected String name;
    protected int powerOfWitchcraft;
    protected int teleportDistance;

    public Hogwarts(String name, int powerOfWitchcraft, int teleportDistance) {
        this.name = name;
        this.powerOfWitchcraft = powerOfWitchcraft;
        this.teleportDistance = teleportDistance;
    }

    public int getPowerOfWitchcraft() {
        return powerOfWitchcraft;
    }

    public void setPowerOfWitchcraft(int powerOfWitchcraft) {
        this.powerOfWitchcraft = powerOfWitchcraft;
    }

    public int getTeleportDistance() {
        return teleportDistance;
    }

    public void setTeleportDistance(int teleportDistance) {
        this.teleportDistance = teleportDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void compareTwoStudents(Hogwarts firstStudent, Hogwarts secondStudent){
        int sumOfFirstStudent = firstStudent.getPowerOfWitchcraft() + firstStudent.getTeleportDistance();
        int sumOfSecondStudent = secondStudent.getPowerOfWitchcraft() + secondStudent.getTeleportDistance();

        String result = sumOfFirstStudent > sumOfSecondStudent ? firstStudent.getName() + " обладает бОльшей мощностью магии, чем " + secondStudent.getName() + ". "
                : secondStudent.getName() + " обладает бОльшей мощностью магии, чем " + firstStudent.getName() + ". ";

        System.out.println(result);
    }
}
