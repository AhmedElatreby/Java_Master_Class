package org.javaMasterClass;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("Exercise 1\n" +
                "try catch\n" +
                "\n" +
                "write a program that converts program arguments to an integer\n" +
                "if value cannot be converted to int store them somewhere\n" +
                "calculate sum for numbers that can be converted to an integer\n" +
                "finally print the numbers that cannot be converted to an int\n" +
                "example: java com.bnta.exercises.week_two_wed.exercises.Exercise6 1 2 a b foo 3\n" +
                "output: Sum: 6 and a, b, foo are not numbers.");

//        System.out.println(convertIntToDouble("c", "55"));

        System.out.println();
        System.out.println("Exercise 2 \n" +
                "run the above code see what error you get\n" +
                "then surround it with try catch block and catch the exception that was thrown.\n" +
                "Inside catch the catch block print \"cannot divide by 0\"" +
                " int result = 10 / 0; \n");

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by 0\" int result = 10 / 0");
        }
    }

    private static boolean isNumber(String str) {
        int num;
        if (str == null || str.equals("")) {
            System.out.println("String cannot be parsed!");
            return false;
        }
        try {
            num = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }


//    private static int convertIntToDouble(String num1, String num2) {
//
//        Integer result = isNumber(num1) + isNumber(num2);
//        System.out.println();
//        return result;
//
//    }
}
