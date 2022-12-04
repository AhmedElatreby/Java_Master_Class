package org.javaMasterClass;

import java.io.FileNotFoundException;
import java.util.Random;
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

        //primeNumber();

        System.out.println();
        System.out.println("Exercise 4\n" +
                "/*\n" +
                "    Write a method that displays random joke to the user.\n" +
                "    Your program should stop displaying jokes when use inputs no.\n" +
                "    For e.g\n" +
                "    Want to hear a joke? Yes/No\n" +
                "        if yes then display joke and repeat same question\n" +
                "        if no then program should exit\n" +
                "*/");
        randomJoke();


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
        for (int i = 2; i < num; i++) {
            if (num % i==0 ) {
                System.out.println( num +" not a primer number");
                break;
            } else {
                System.out.println(num +" is a prime number.");
            }
        }
    }
    private static void randomJoke(){
        Random random = new Random();
        String[] jokes = {"Did you hear about the mathematician who’s afraid of negative numbers?\n" +
                "He’ll stop at nothing to avoid them.", "Knock! Knock!\n" +
                "Who’s there?\n" +
                "Control Freak.\n" +
                "Con…\n" +
                "OK, now you say, `Control Freak who?` ", "Hear about the new restaurant called Karma?\n" +
                "There’s no menu: You get what you deserve", "Did you hear about the actor who fell through the floorboards?\n" +
                "He was just going through a stage", "Did you hear about the claustrophobic astronaut?\n" +
                "He just needed a little space."};
        int randomNumber = random.nextInt(jokes.length);
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Want to hear a joke? Yes/No");
            String input = scan.next();
            if (input.equalsIgnoreCase("Yes")) {
                System.out.println(jokes[randomNumber]);
                continue;
            } else if (input.equalsIgnoreCase("No")){
                System.out.println("Thank you :-)");
                break;
            }
        }
    }
}
