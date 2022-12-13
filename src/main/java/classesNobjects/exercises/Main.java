package classesNobjects.exercises;

import classesNobjects.exercises.car.Car;
import classesNobjects.exercises.car.EngineType;
import classesNobjects.exercises.car.Manufacture;
import classesNobjects.exercises.dealer.DealerService;
import classesNobjects.exercises.dealer.DealerShip;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(Manufacture.FERRARI, EngineType.PETROL,3.6,3,new BigDecimal (250000));
        Car car2 = new Car(Manufacture.ASTON_MARTIN,EngineType.PETROL,2.6,3,new BigDecimal (200000));
        Car car3 = new Car(Manufacture.ASTON_MARTIN,EngineType.PETROL,2.6,3,new BigDecimal (200000));


        DealerShip dealer = new DealerShip("Car 4 you", 25);
        System.out.println(DealerShip.count);

        DealerService dealerService = new DealerService();
        dealerService.addCarToDealership(car3,dealer);



        System.out.println(dealer);


        System.out.println(dealer);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getManufacture());
        System.out.println(DealerShip.count);

        System.out.println(dealer.getCapacity());

    }
}
