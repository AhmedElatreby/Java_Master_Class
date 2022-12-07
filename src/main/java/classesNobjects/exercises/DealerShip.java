package classesNobjects.exercises;

import java.util.Objects;

public class DealerShip {
    private String name;
    private int maxCarsOnDisplay;
    private int carsInStock;

    public DealerShip(String name, int maxCarsOnDisplay, int carsInStock) {
        this.name = name;
        this.maxCarsOnDisplay = maxCarsOnDisplay;
        this.carsInStock = carsInStock;
    }

    public DealerShip(String name, int maxCarsOnDisplay) {
        this.name = name;
        this.maxCarsOnDisplay = maxCarsOnDisplay;
    }

    public int countCarsInStock() {
        System.out.println("number cars in the dealership: " + carsInStock);
        return carsInStock;
    }

    public void addCarToDealership(Car[] car){


        for (int i = 0; i < car.length; i++) {
            car[i] = new Car();
        }


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
