package org.javaMasterClass;

import java.util.Arrays;

public class LoopsAndArrays {

    public static void main(String[] args) {
        // declare an empty integer array of length = 3
        int[] myArray = new int[3];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 55;

        myArray[1] = 17;


        // print the contents to the console
        System.out.println(Arrays.toString(myArray));

        // fill it with the number `4`

        // print the array to the console

        int[] numbers = {1, 2, 3, 4, 5};


        numbers[4] = 55;
        System.out.println(Arrays.toString(numbers));

        // declare and initialize a String array which holds the values "a", "b", "c" and "d"
        String[] sArray = {"a", "b", "c", "d"};
        // print the array to the console

        System.out.println(Arrays.toString(sArray));

        // using your answer from Q5 above, create a second array which is initialized using your original array

        // hint: instead of using the `new` keyword, try simply giving the name of your original array
        // change the value at index 0 of the new array to "z"
        sArray[0] = "z";
        // print both of your arrays and compare
        System.out.println(Arrays.toString(sArray));

        // using your answer to Q6, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
        String[] copy = Arrays.copyOf(sArray, 5);

        copy[0] = "z";
        System.out.println(Arrays.toString(copy));


        // NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
        // change the value at index 0 of the new array to "z"
        // print both of the arrays and compare

        String[] a = {"a", "b", "c", "d"};
        // create a `for` loop which prints each item in the array

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println();

        // create a for loop which goes from 0 to 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        // print each value

        System.out.println("Exercise 10");

        // create an array. Remember to manually set the size
        int[] myArray1 = new int[10];
        // create a for loop which goes from 0 to 10, adding each value to an array

        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] = i;

        }
        System.out.println(Arrays.toString(myArray1));

        System.out.println();

        System.out.println("Exercise 11");

        // create an array of n numbers
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // create a sum variable
        int sum = 0;
        // create a loop
        for (int i = 0; i < n.length; i++) {
            // add each item to the sum value
            sum += i;
            System.out.println(sum);
        }
        // outside the loop print the total sum
        System.out.println("sum: " + sum);

        System.out.println();

        System.out.println("Exercise 12 ");
        // create a for loop which goes through each string in our array
        String[] myString = {"i", "sure", "do", "love", "bees"};

        for (int i = 0; i < myString.length; i++) {
            // make each word uppercase
            // assign the value in the array to the uppercase string
            myString[i] = myString[i].toUpperCase();
        }
        // print our resulting array
        System.out.println(Arrays.toString(myString));

        System.out.println();

        System.out.println("Exercise 13 ");
        // create a for loop which goes through each string in our array
        String[] myString1 = {"i", "sure", "do", "love", "bees"};
        for (int i = 0; i < myString1.length; i++) {
            // grab the first letter of our word
            // capitalise the first letter
            String letter = myString1[i].substring(0, 1);
            // add the capitalised letter to the rest of the provided word
            // assign the value to an array
            String word = myString1[i].substring(1);
            // print our resulting array
            System.out.println(letter.toUpperCase() + word);
        }

        System.out.println();

        System.out.println("Exercise 14 ");
            /*
        Write a program that reverses an array of Strings
        String[] content = {"you", "are", "how", "hello"}
        Tip. Use for loop and you to start at highest index.
        Output should be: hello how are you?. Note question mark at the end
    */
        String[] content = {"you", "are", "how", "hello"};

        for (int i = content.length -1; i >= 0; i--) {
            String reverse = " " + content[i] ;

            System.out.print(reverse);
        }

        System.out.println("?");

        System.out.println();

        System.out.println("Exercise 15 ");
            /*
        Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

        Tip:
        - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        - create variable to store result. double result = 0;
        - convert string to array by using the String[] numbers = input.slip(", ")
        - then loop.
        - convert each string to decimal and add to current result
            - use Double.parseDouble(string) to convert a string to double
    */
        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        double ressult = 0;
        ressult = Double.parseDouble(input);
        String[] numbers1 = input.split(",");
        System.out.println(Arrays.toString(numbers1));
        for (int i = 0; i < numbers1.length; i++) {
            ressult += i;
        }
        System.out.println(ressult);

    }


}