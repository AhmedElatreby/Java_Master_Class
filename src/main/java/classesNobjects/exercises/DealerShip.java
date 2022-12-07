package classesNobjects.exercises;

import java.util.Objects;

public class DealerShip {
    private String name;
    private int maxCarsOnDisplay;
    private int carsInStock;
    private Car[] cars;

    public static int count = 0;

    public DealerShip(String name, int maxCarsOnDisplay, int carsInStock, Car[] cars) {
        this.name = name;
        this.maxCarsOnDisplay = maxCarsOnDisplay;
        this.carsInStock = carsInStock;
        this.cars = new Car[carsInStock];
    }

    {
        count++;

    }

    public DealerShip(String name, int maxCarsOnDisplay) {
        this.name = name;
        this.maxCarsOnDisplay = maxCarsOnDisplay;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCarsOnDisplay() {
        return maxCarsOnDisplay;
    }

    public void setMaxCarsOnDisplay(int maxCarsOnDisplay) {
        this.maxCarsOnDisplay = maxCarsOnDisplay;
    }



    public char[] setCarsInStock(int carsInStock) {
        this.carsInStock = carsInStock;
        return new char[0];
    }

    @Override
    public String toString() {
        return "DealerShip{" +
                "name='" + name + '\'' +
                ", maxCarsOnDisplay=" + maxCarsOnDisplay +
                ", carsInStock=" + carsInStock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DealerShip that = (DealerShip) o;
        return maxCarsOnDisplay == that.maxCarsOnDisplay && carsInStock == that.carsInStock && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxCarsOnDisplay, carsInStock);
    }
}
