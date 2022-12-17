package oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Foo");
        Animal cat = new Cat("Bar");

        dog.makeSound();
        cat.makeSound();
    }
}
