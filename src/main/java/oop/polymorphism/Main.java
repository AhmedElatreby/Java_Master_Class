package oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        ElectricScooter electricScooter = new ElectricScooter();

        Vehicle[] vehicles = {car, bicycle, electricScooter};

        Person person = new Person("Ahmed", vehicles);
        for (Vehicle vehicle : person.getVehicle()) {
            vehicle.move(10);
            System.out.println(vehicle.getCurrentSpeed());
            System.out.println();
        }
        System.out.println("Purchase rate " + Vehicle.PURCHASE_RATE);

        System.out.println("Current speed in Km is " + car.milesToKm());

    }
}
