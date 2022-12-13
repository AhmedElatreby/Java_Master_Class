package classesNobjects.exercises.dealer;

import classesNobjects.exercises.car.Car;

public class DealerService {
    public boolean addCarToDealership(Car car, DealerShip dealerShip) {
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null or empty");

        }
        int count = 0;
        for (Car c : dealerShip.getCars()) {
            if (c != null) {
                count++;

            }

        }
        if (count >= dealerShip.getCapacity()) {

            return false;
        }

        // add car to dealership
        dealerShip.setCars(new Car[1]);
        return true;


    }

}
