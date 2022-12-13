package classesNobjects.exercises.car;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;


public class Car implements Serializable {
    private String regNumber;
    private Manufacture manufacture;
    private EngineType engineType;
    private double engineSize;
    private int numberOfDoors;
    private BigDecimal price;

    public Car(Manufacture manufacture, EngineType engineType, double engineSize, int numberOfDoors, BigDecimal price) {
        this.manufacture = manufacture;
        this.engineType = engineType;
        this.engineSize = engineSize;
        this.numberOfDoors = numberOfDoors;
        this.price = price;
    }

    public Car() {

    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineSize, engineSize) == 0 && numberOfDoors == car.numberOfDoors && Objects.equals(regNumber, car.regNumber) && manufacture == car.manufacture && engineType == car.engineType && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, manufacture, engineType, engineSize, numberOfDoors, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacture=" + manufacture +
                ", engineType=" + engineType +
                ", engineSize=" + engineSize +
                ", numberOfDoors=" + numberOfDoors +
                ", price=" + price +
                '}';
    }

}
