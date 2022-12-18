package oop.polymorphism;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String name;
    private Vehicle[] vehicle;


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Vehicle[] vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle[] getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle[] vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vehicle=" + Arrays.toString(vehicle) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Arrays.equals(vehicle, person.vehicle);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(vehicle);
        return result;
    }
}
