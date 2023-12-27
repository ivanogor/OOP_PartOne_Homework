public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 100, 97, 95,100,100);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 91, 93, 100,92,100);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 85, 87, 92,90,98);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 87 ,85 ,94 ,95, 99, 97 ,100);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 75,85 ,84 ,85, 85, 87 ,80);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 92,87,74,75, 72, 92,100);

        Hufflepuff zachariahSmith = new Hufflepuff("Zachariah Smith",82,85,83,87,92);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory",72,85,83,87,92);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley",62,65,73,77,82);

        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang",84,83,95,80,78,94);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil",79,85,85,83,77,93);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby",86,87,92,90,87,91);

        System.out.println(harryPotter);

        hermioneGranger.compareTo(ronWeasley);
        dracoMalfoy.compareTo(grahamMontague);
        zachariahSmith.compareTo(cedricDiggory);
        zhouChang.compareTo(padmaPatil);

        harryPotter.compareTo(marcusBelby);
        marcusBelby.compareTo(harryPotter);
    }
}