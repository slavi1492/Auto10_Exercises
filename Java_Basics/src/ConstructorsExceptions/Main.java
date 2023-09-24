package ConstructorsExceptions;

public class Main {
    public static void main(String[] args) {
        Car newCar = new Car("Skoda", 2015, 154, true);
        System.out.println(newCar.name + " " + newCar.color + " " + newCar.releaseYear + " " + newCar.horsePower + " " + newCar.secondHand);
        Car secondCar = new Car();
        System.out.println(secondCar.name + " " + secondCar.color + " " + secondCar.releaseYear + " " + secondCar.horsePower + " " + secondCar.secondHand);
        // Math.PI
    }
}
