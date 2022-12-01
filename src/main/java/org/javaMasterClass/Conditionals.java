package org.javaMasterClass;

public class Conditionals {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Question 1");
        // create an integer variable
        int num1 = 10;
        // create a second integer variable
        int num2 = 55;
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        if (num1 <= num2) {
            System.out.println("num1 is grater than num2");
        }
        System.out.println();
        System.out.println("Question 2");
        // create a string variable
        String str1 = "heLlo";
        // create a second string variable which has the same value as the first
        String str2 = "hello";
        // create an `if` statement which compares the two variables and prints to the console if they are equal

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("str1 is equal str2");
        }
        System.out.println();
        System.out.println("Question 3");
        // create an string variable using the `new` keyword
        String myString = new String("Hello!");
        // create a second string variable which has the same value as the first, again using the `new` keyword
        String myString1 = new String("Hello!");
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        if (myString.equals(myString1)) {
            System.out.println("They are the same! when using .equals");
        }

        System.out.println();
        System.out.println("Question 4");
        // create two `int` variables. Assign them values
        int num3 = 12;
        int num4 = 55;
        // create an `if` statement which compares whether one value is greater than the other
        // print something to the console if the condition is met
        // create an `else` statement which prints to the console if the above condition is NOT met
        if (num3 >= num4) {
            System.out.println("num3 is greater than num4");
        } else {
            System.out.println("num3 is not grater then num4");
        }

        System.out.println();
        System.out.println("Question 5");
        // create three `int` variables. Assign them values with the first value sitting between the other two
        int num5 = 64;
        int num6 = 34;
        int num7 = 95;
        // create an `if` statement which compares whether the first value is greater than the second AND less than the third
        // print something to the console if the condition is met
        // create an `else` statement which prints to the console if the above condition is NOT met
        if (num5 >= num6 && num5 <= num7) {
            System.out.println("num5 is grater than num6 And num5 is less than num7");
        } else {
            System.out.println("num5 is  not grater than num6 And not num5 is less than num7");
        }

        System.out.println();
        System.out.println("Question 7");
        // create a String variable and assign it a value
        String str3 = "hello";
        // create an `if` statement which grabs the first letter of your word and compares it against a Character value
        // print something to the console if the condition is met
        if (str3.charAt(0) != 'H') {
            System.out.println("They not the same!");
        }

        System.out.println();
        System.out.println("Question 8");
        // create a String variable and assign it a value
        String word = "Hello!";
        String input = "l";
        // create a `for` loop which wraps around your answer from Question 7
        // modify your `if` statement to check the character at each index
        // Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
        // print something to the console if the condition is met
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            var found = Character.toString(c).equalsIgnoreCase(input);
            if (found) {
                System.out.println(c + " found ");
            } else {
                System.out.println(c + " not found");
            }
        }

        System.out.println();
        System.out.println("Question 9");
        // create a for loop which goes from 0 to 20
        for (int i = 0; i <= 20 ; i+=2) {
            System.out.println(i);
        }
        // print each even value


    }
}
