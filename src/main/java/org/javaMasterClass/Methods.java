package org.javaMasterClass;

public class Methods {

    private static int addTwoNumbers(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static void negate(int num){
        num = -num;
        System.out.println(num);
    }

    public static void checkTwoNumbers(int num1, int num2){
        if (num1 == num2) {
            System.out.println("");
        }
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
    }

}
