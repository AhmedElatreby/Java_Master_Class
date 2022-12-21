package dataStructures.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
//        input();
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        String[] my_array2 = {
                "Java",

                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        sortIntArray(my_array1);
        sortStringArray(my_array2);
        sumArray(my_array);
        arrayAverage(my_array1);
        average(my_array, 5);

    }

    // function a user to input 10 numbers and return the value of the input after
    public static void input() {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {

            System.out.println("Please enter a number");
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println("The value of num [" + i + "] is " + num[i]);
        }
    }

    // Write a Java a function to sort a numeric array.
    public static void sortStringArray(String[] str) {
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }

    // Write a Java a function to sort a string array.
    public static void sortIntArray(int[] num) {
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }

//    Write a Java program to sum values of an array

    public static void sumArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("the sum of the array = " + sum);
    }

//    Write a Java program to calculate the average value of array elements

    public static void arrayAverage(int[] arr) {
        int sum = 0;
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            result = sum / arr.length;
        }
        System.out.println("Average value of the array elements is : " + result);
        System.out.println(sum);
    }

    public static String average(int A[], int N) {
        float sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        float avg = sum / N;
        String value = String.format("%.2f", avg);
        return value;
    }


}
