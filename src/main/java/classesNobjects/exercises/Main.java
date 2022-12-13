package classesNobjects.exercises;

import classesNobjects.exercises.car.Car;
import classesNobjects.exercises.car.CarService;
import classesNobjects.exercises.car.EngineType;
import classesNobjects.exercises.car.Manufacture;
import classesNobjects.exercises.dealer.DealerService;
import classesNobjects.exercises.dealer.DealerShip;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        carsExample();
    }

    private static void carsExample() {
        Car car = new Car("ABC 123", Manufacture.BMW, EngineType.DIESEL, 2.8, 3, new BigDecimal(80000));
        Car car1 = new Car(Manufacture.FERRARI, EngineType.PETROL, 3.6, 3, new BigDecimal(250000));
        Car car2 = new Car(Manufacture.ASTON_MARTIN, EngineType.PETROL, 2.6, 3, new BigDecimal(200000));
        Car car3 = new Car(Manufacture.ASTON_MARTIN, EngineType.PETROL, 2.6, 3, new BigDecimal(200000));
        CarService carService = new CarService();
        carService.registerNewCar(car);
        carService.registerNewCar(car1);
        carService.registerNewCar(car2);
        carService.registerNewCar(car3);
        System.out.println(Arrays.toString(carService.getCars()));

    }
}
