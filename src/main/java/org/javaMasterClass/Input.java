package org.javaMasterClass;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws FileNotFoundException {
//        File inputFile = new File("C:\\Users\\ahmed\\input.txt");
//        // Create a File object from our text file
//
//        Scanner ourScanner = new Scanner(inputFile);
//        // Create a Scanner object which takes in our File object
//
//        while (ourScanner.hasNext()) {
//            // A while loop which checks if there is another line in the text file
//
//            System.out.println("There's another line!");
//
//            String input = ourScanner.nextLine();
//            // Note that we need to include a consumption method still to make use of the input
//
//            System.out.println(input);
//        }

        System.out.println();
        System.out.println("Exercise 1\n" +
                "Take an input string from the user (from the terminal) and print it back out all in upper case");
//        Scanner scan = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String input = scan.nextLine();
//        System.out.println("HELLO " + input.toUpperCase());

        System.out.println();
        System.out.println("Exercise 2\n" +
                "/*\n" +
                "    Write a program that receives numbers as program arguments and prints to console if numbers are even or odd\n" +
                "    You might compile and run the program via command line or by editing configuration and pass program arguments\n" +
                "*/");
        // evenOrOdd();
        System.out.println();
        System.out.println("Exercise 3\n" +
                "/*\n" +
                "    Write a program that takes an input number from the console and prints if number is prime\n" +
                "    Create a method to check if number is prime then use against the input\n" +
                "*/");

        primeNumber();


    }

    private static void evenOrOdd() {
        System.out.println("Please enter a whole number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd!");
        }

    }

    private static void primeNumber() {
        System.out.println("Please enter a number between 1 and 100");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            if (i % i==0 ) {
                System.out.println( num +" not a primer number");
                break;
            } else {
                System.out.println(num +" is a prime number.");
            }
        }
    }
}
