package person;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Address address = new Address("1 First Street", "BH12 3AB", "England");
        Car bmw = new Car(CarBrand.BMW, new BigDecimal(55_000.00));
        Car vw = new Car(CarBrand.VW, new BigDecimal(45_000.00));
        Car[] cars = {bmw, vw};

        Person alex = new Person("John", "Smith",Gender.MALE, 41, address, cars);

        System.out.println(alex);

    }
}
