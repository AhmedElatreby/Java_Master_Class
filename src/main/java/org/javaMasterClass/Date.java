package org.javaMasterClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class Date {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Exercise 1\n" +
                "Print today's Date and Time using LocalDate and LocalDateTime");
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today's date and time is: " + today);

        System.out.println();
        System.out.println("Exercise 2\n" +
                "Add 100 days to your date of birth and print it");
        LocalDate DOB = LocalDate.of(1981, Month.MAY, 10);
        System.out.println("The date of my DOB in 100 years will be: " + DOB.plusYears(100));
        System.out.println();
        System.out.println("Exercise 3\n" +
                "Write a method that calculate age on any given date");

        int age = calculateAge(LocalDate.of(1981,Month.MAY,10));
        System.out.println("You are " + age + " years old");

    }


    private static int calculateAge(LocalDate date) {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(date, currentDate).getYears();
        return age;
    }
}
