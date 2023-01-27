## Loops and Arrays

* Exercise 1
```text
- Declare an empty integer array of length = 3
- Print the contents to the console
```
* Exercise 2

```text
Continuing from previous exercise

- Fill it with the number `4`
- Print the array to the console
```

* Exercise 3
```text
Continuing from previous exercise
- Reassign the second value in the array to the number `17` 
- Print the array to the console
```

* Exercise 4
 ```text
What happens when you try to re assign index 5 to any integer?
```
```java
public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
}
answer: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
```
* Exercise 5
```text
- Declare and initialize a String array which holds the values "a", "b", "c" and "d"
- Print the array to the console
```
* Exercise 6
```text
 - Using your answer to Q5, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
   NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
 - Change the value at index 0 of the new array to "z"
 - Print both of the arrays and compare
 - Create a `for` loop which prints each item in the array
```

* Exercise 7
```text
- Create a for loop which goes from 0 to 10
- Print each value
```

* Exercise 8
```text
- Create a for loop which goes from 10 down to 0
- Print each value
```

* Exercise 9
```text
- Create an array. Remember to manually set the size
- Create a for loop which goes from 0 to 10, adding each value to an array
- Print our array
```

* Exercise 10
```text
- Create an array of n numbers
- Create a sum variable
- Create a loop
- Add each item to the sum value
- Outside the loop print the total sum
```

* Exercise 11
```text
- Create a for loop which goes through each string in our array
- Make each word uppercase
- Assign the value in the array to the uppercase string
- Print our resulting array
```
* Exercise 12
```text
- Create a for loop which goes through each string in our array
- Grab the first letter of our word
- Capitalise the first letter
- Add the capitalised letter to the rest of the provided word
- Assign the value to an array
- Print our resulting array
```
* Exercise 13
```text
Write a program that reverses an array of Strings
String[] content = {"you", "are", "how", "hello"}
Tip. Use for loop and you to start at highest index.
Output should be: hello how are you?. Note question mark at the end
```

* Exercise 14
```text
Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

        Tip: 
        - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        - create variable to store result. double result = 0;
        - convert string to array by using the String[] numbers = input.slip(", ")
        - then loop.
        - convert each string to decimal and add to current result
        - use Double.parseDouble(string) to convert a string to double
```
