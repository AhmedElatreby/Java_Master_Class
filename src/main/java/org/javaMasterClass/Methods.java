package org.javaMasterClass;

import java.util.Arrays;

public class Methods {

    private static double rental(double rent, double property) {
        rent *= 12;
        return (rent / property) * 100;
    }

    private static int addTwoNumbers(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    private static void negate(int num) {
        num = -num;
        System.out.println(num);
    }

    private static void checkTwoNumbers(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("");
        }
    }

    private static void compareTwoNumbers(int n1, int n2) {
        if (n1 > n2) {
            System.out.println("The first number is larger");
        } else if (n2 > n1) {
            System.out.println("The second number is larger");
        } else {
            System.out.println("The numbers are equal");
        }
    }

    private static void capitalizesFirstLetter(String input){
        String firstLetter = String.valueOf(input.charAt(0)).toUpperCase();
        String remaining = input.substring(1);
        input = firstLetter + remaining;
        System.out.println(input);
    }

    private static void numberOfItems(String[] input){
        System.out.println(input.length);
    }

    private static void numberOfWord(String input){
        String items = String.valueOf(input.split(" ").length);
        System.out.println( "\"" + input +"\"" + " has "+ items + " words");
    }

    public static void main(String[] args) {
        System.out.println("Exercise 1\n" +
                "Write a method which takes two numbers as arguments and prints their sum to the terminal.");
        int result = addTwoNumbers(55, 22);
        System.out.println(result);

        System.out.println();
        System.out.println("Exercise 2\n" +
                "Write a method which takes a number as an argument and returns that number negated," +
                " e.g. passing 5 as an argument should return -5; passing -10 should return 10.");
        negate(5);

        System.out.println();
        System.out.println("Exercise 3\n" +
                "Write a method which takes two numbers as arguments," +
                " checks if they are the same and returns the appropriate boolean value.\n" +
                "You should check both possible outcomes here," +
                " i.e. that it returns true when it is supposed to and false when it is supposed to.");

        System.out.println();
        System.out.println("calculate Property Yield");
        double result1 = rental(1_300, 250_000);
        System.out.println(result1);

        System.out.println();
        System.out.println("Exercise 4\n" +
                "Write a method which takes two numbers as arguments and prints one of:\n" +
                "\"The first number is larger\"\n" +
                "\"The second number is larger\"\n" +
                "\"The numbers are equal\n");
        compareTwoNumbers(20, 10);

        System.out.println();
        System.out.println("Exercise 5\n" +
                "Write a method which takes a string as an argument, capitalizes the first letter and returns the capitalized string.\n" +
                "HINT: The .toUpperCase() method will capitalize the whole string. " +
                "Investigate how to split the first letter from the string, capitalize that, then join the pieces back together");

        capitalizesFirstLetter("hello");

        System.out.println();
        System.out.println("Exercise 6\n" +
                "Write a method which takes an array of strings as an argument and returns the number of items in the array.");

        numberOfItems(new String[]{"Hi", "How", "are", "you", "?"});

        System.out.println();
        System.out.println("Exercise 7\n" +
                "Write a method which takes a sentence as an argument," +
                " counts the number of words in the array and prints \"The sentence contains X words\".");
        numberOfWord("hello how you doing");
    }


}
