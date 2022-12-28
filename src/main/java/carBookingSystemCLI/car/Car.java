package carBookingSystemCLI.car;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public class Car {
    private UUID carId;
    private CarBrand brand;
    private Color color;
    private CarType carType;
    private EngineType engineType;
    private BigDecimal price;
    private String regNumber;

    public Car() {
    }

    public Car(UUID carId, CarBrand brand, Color color, CarType carType, EngineType engineType, BigDecimal price, String regNumber) {
        this.carId = carId;
        this.brand = brand;
        this.color = color;
        this.carType = carType;
        this.engineType = engineType;
        this.price = price;
        this.regNumber = regNumber;
    }

    public UUID getCarId() {
        return carId;
    }

    public void setCarId(UUID carId) {
        this.carId = carId;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", brand=" + brand +
                ", color=" + color +
                ", carType=" + carType +
                ", engineType=" + engineType +
                ", price=" + price +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carId, car.carId) && brand == car.brand && color == car.color && carType == car.carType && engineType == car.engineType && Objects.equals(price, car.price) && Objects.equals(regNumber, car.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, brand, color, carType, engineType, price, regNumber);
    }
}
