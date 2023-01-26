package exercises.loopAndArrays;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        int[] arr= new int [3];
        System.out.println(Arrays.toString(arr));

        // Exercise 2
        arr[0]=4;
        arr[1]=4;
        arr[2]=4;
        System.out.println(Arrays.toString(arr));

        // Exercise 3
        arr[1]=17;
        System.out.println(Arrays.toString(arr));

        // Exercise 4
        int[] numbers = {1, 2, 3, 4, 5};
        //numbers[5] =4; // Array Index Out Of Bounds Exception

        // Exercise 5
        String[] SArr= {"a","b","c","d"};
        SArr[0]="z";
        System.out.println(Arrays.toString(SArr));

        // Exercise 6
        String[] copy = Arrays.copyOf(SArr, 9);
        copy[0]= "Z";
        System.out.println("Original array " + Arrays.toString(SArr));
        System.out.println("Copy array " + Arrays.toString(copy));

        for (String i: SArr) {
            System.out.println(i);
        }
        System.out.println();

        // Exercise 7
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        // Exercise 8
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        // Exercise 9
        int[] arr1 = new int[11];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
            System.out.println(arr1[i]);
        }
        System.out.println();

        //Exercise 10
        int[] arr2 ={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for (int i = 0; i < arr2.length; i++) {
            sum += i ;
        }
        System.out.println("Sum = " + sum);

        System.out.println();
        // Exercise 11
        String[] arr3 = {"i", "sure", "do", "love", "bees"};
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr3[i].toUpperCase();
            System.out.println(arr3[i].toUpperCase());
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println();

        // Exercise 12
        String[] arr4 = {"i", "sure", "do", "love", "bees"};
        for (int i = 0; i < arr4.length; i++) {
            String letter = arr4[i].substring(0,1).toUpperCase();
            String word = arr4[i].substring(1);
            System.out.println(letter+word);
        }
        System.out.println();

        // Exercise 13
        String[] content = {"you", "are", "how", "hello"};
        for (int i = content.length -1; i >= 0; i--) {
            String reverse = " " + content[i];
            System.out.print(reverse);
        }
        System.out.println("?");
        System.out.println();

        // Exercise 14

        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0;
        String[] numbers1 = input.split(", ");
        System.out.println(Arrays.toString(numbers1));
        for (int i = 0; i < numbers1.length; i++) {
            result += i;
            result = Double.parseDouble(String.valueOf(result));
        }
        System.out.println(result);



    }
}
