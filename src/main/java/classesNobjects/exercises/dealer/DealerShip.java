package classesNobjects.exercises.dealer;

import classesNobjects.exercises.car.Car;
import classesNobjects.objects.car.CarService;

import java.util.Objects;

public class DealerShip {
    private String name;
    private int capacity;
    private int carsInStock;
    private Car[] cars;

    public static int count = 0;
    private CarService carService;

    public DealerShip(){
        this.carService = new CarService();
    }

    public DealerShip(String name, int maxCarsOnDisplay, int carsInStock) {
        this.name = name;
        this.capacity = capacity;
        this.carsInStock = carsInStock;
        this.cars = new Car[capacity];
    }

    {
        count++;

    }

    public DealerShip(String name, int maxCarsOnDisplay) {
        this.name = name;
        this.capacity = maxCarsOnDisplay;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public int getCarsInStock() {
        return carsInStock;
    }

    public void setCarsInStock(int carsInStock) {
        this.carsInStock = carsInStock;
    }

    @Override
    public String toString() {
        return "DealerShip{" +
                "name='" + name + '\'' +
                ", maxCarsOnDisplay=" + capacity +
                ", carsInStock=" + carsInStock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DealerShip that = (DealerShip) o;
        return capacity == that.capacity && carsInStock == that.carsInStock && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity, carsInStock);
    }
}
