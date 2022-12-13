package classesNobjects.objects.car;

import classesNobjects.exercises.dealer.DealerShip;

public class CarService {
    private DealerShip dealerShip;

    public boolean addCar(Car car){
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null");
        }
        int count = 0;
        for (int c = 0; c < dealerShip.getCapacity(); c++) {
            if (c != count) {
                count++;
            }
        }
        if(count >= dealerShip.getCapacity()){
            return false;
        }

        return true;
    }


}
