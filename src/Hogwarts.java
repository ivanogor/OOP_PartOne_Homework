abstract public class Hogwarts {
    private String name;
    private int powerOfWitchcraft;
    private int teleportDistance;

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

    @Override
    public String toString() {
        return "Имя студента - " + name + ". \nСила магии - " + powerOfWitchcraft + ". \nРасстояние трансгрессии - " + teleportDistance + ". \n";
    }

    public void compareTo(Hogwarts anotherStudent){
        int sumOfFirstStudent = this.getPowerOfWitchcraft() + this.getTeleportDistance();
        int sumOfSecondStudent = anotherStudent.getPowerOfWitchcraft() + anotherStudent.getTeleportDistance();

        String result = sumOfFirstStudent > sumOfSecondStudent ? this.getName() + " обладает бОльшей мощностью магии, чем " +
                anotherStudent.getName() + ". "
                : anotherStudent.getName() + " обладает бОльшей мощностью магии, чем " + this.getName() + ". ";

        System.out.println(result);
    }

}
