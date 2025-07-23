package org.example;

public class Artifact {
    int number;
    String culture;
    int vec;

    public Artifact(int number) {
        this.number = number;
    }
    public Artifact(int number, String culture) {
        this.number = number;
        this.culture = culture;
    }

    public Artifact (int number, String culture, int vec) {
        this.number = number;
        this.culture = culture;
        this.vec = vec;
    }

    public static void main(String[] args) {
        Artifact one = new Artifact(1223214);
        Artifact two = new Artifact(4323, "Ацтеки");
        Artifact three = new Artifact(12342, "Славяне", 13);

        System.out.println("Номер: " + one.number);
        System.out.println("Номер: " + two.number + ". Культура: " + two.culture);
        System.out.println("Номер: " + three.number + ". Культура: " +  three.culture + ". Век: " + three.vec);

    }
}