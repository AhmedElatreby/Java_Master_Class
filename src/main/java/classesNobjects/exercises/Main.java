package classesNobjects.exercises;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(Manufacture.FERRARI,EngineType.PETROL,3.6,3,new BigDecimal (250000));
        Car car2 = new Car(Manufacture.ASTON_MARTIN,EngineType.PETROL,2.6,3,new BigDecimal (200000));
        Car car3 = new Car(Manufacture.ASTON_MARTIN,EngineType.PETROL,2.6,3,new BigDecimal (200000));
//        car1.setManufacture(Manufacture.ASTON_MARTIN);
//        car1.setEngineType(EngineType.ELECTRIC);
//        car1.setNumberOfDoors(5);
//        car1.setEngineSize(2.4);
//        car1.setPrice(new BigDecimal(5000000));

        DealerShip dealer = new DealerShip("Car 4 you", 25);
        System.out.println(DealerShip.count);

        System.out.println(dealer.setCarsInStock(10));
//        dealer.getCarsInStock();
        System.out.println(dealer);



//        dealer.addCarToDealership(car1);
//        dealer.addCarToDealership(car2);
//        dealer.addCarToDealership(car3);
//        dealer.addCarToDealership(car1);
        System.out.println(DealerShip.count);

        System.out.println(dealer);
        System.out.println(car1);

    }
}
