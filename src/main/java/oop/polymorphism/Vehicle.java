package oop.polymorphism;

public interface Vehicle {
    // constants
    double PURCHASE_RATE = 0.5;

    void move(int amount);

    void applyBreaks(int amount);

    int getCurrentSpeed();

    default double milesToKm() {
        return getCurrentSpeed() * 1.609;
    }
}
