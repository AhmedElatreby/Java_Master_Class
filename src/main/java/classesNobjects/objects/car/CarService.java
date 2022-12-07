package classesNobjects.objects.car;

import classesNobjects.exercises.DealerShip;

public class CarService {
    public boolean addCar(Car car, DealerShip dealerShip){
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null");
        }
        int count = 0;
        for (int c = 0; c < dealerShip.getMaxCarsOnDisplay(); c++) {
            if (c != count) {
                count++;
            }
        }
        if(count >= dealerShip.getMaxCarsOnDisplay()){
            return false;
        }

        return true;
    }


}
