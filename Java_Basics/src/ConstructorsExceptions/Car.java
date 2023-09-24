package ConstructorsExceptions;

public class Car {
    String name = "N/A";
    String color = "N/A";
    int releaseYear = -1;
    int horsePower = -1;
    boolean secondHand = false;

    public Car(String name, String color, int releaseYear, int horsePower, boolean secondHand) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

    public Car(String name, String color, boolean secondHand) {
        this.name = name;
        this.color = color;
        this.secondHand = secondHand;
    }

    public Car(String name, String color, int releaseYear, int horsePower) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
    }

    public Car(String name, int releaseYear, int horsePower, boolean secondHand) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

    public Car() {
    }
}
