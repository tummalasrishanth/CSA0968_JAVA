import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {

        Car car = new Car("TN10AB1234", "Goutham", 5);
        Truck truck = new Truck("TN20CD5678", "Ramesh", 10);
        Motorcycle bike = new Motorcycle("TN30EF9012", "Suresh", true);

        System.out.println("Car Details:");
        car.display();

        System.out.println("\nTruck Details:");
        truck.display();

        System.out.println("\nMotorcycle Details:");
        bike.display();
    }
}

class Vehicle {
    String licensePlate;
    String owner;

    Vehicle(String licensePlate, String owner) {
        this.licensePlate = licensePlate;
        this.owner = owner;
    }

    void display() {
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Owner: " + owner);
    }
}

class Car extends Vehicle {
    int seatingCapacity;

    Car(String licensePlate, String owner, int seatingCapacity) {
        super(licensePlate, owner);
        this.seatingCapacity = seatingCapacity;
    }

    void display() {
        super.display();
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    Truck(String licensePlate, String owner, int loadCapacity) {
        super(licensePlate, owner);
        this.loadCapacity = loadCapacity;
    }

    void display() {
        super.display();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    boolean hasGear;

    Motorcycle(String licensePlate, String owner, boolean hasGear) {
        super(licensePlate, owner);
        this.hasGear = hasGear;
    }

    void display() {
        super.display();
        System.out.println("Has Gear: " + hasGear);
    }
}