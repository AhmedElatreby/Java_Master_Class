package org.javaMasterClass;

import org.javaMasterClass.size.TShirtSize;

public class Main {
    private static void printEnum(){
        for (TShirtSize shirt: TShirtSize.values()) {
            String name = shirt.name().toLowerCase();
            System.out.println(name);
        }

    }
    public static void main(String[] args) {
        System.out.println("Exercise 1\n" +
                "Remove the above enum from this class and put it as separate file.\n" +
                "You should create a separate class of type enum\n" +
                "Run this code and should print T Shirt Size: M");
        System.out.println("T Shirt Size: " + TShirtSize.M);

        System.out.println();
        System.out.println("Exercise 2\n" +
                "invoke .values() method on ThirstSize enum and loop through its values and while looping lowercase each value\n" +
                "hint: while you loop through enums invoke .name() to convert enum to string. without it, you can't lowercase");

        printEnum();

    }
}
