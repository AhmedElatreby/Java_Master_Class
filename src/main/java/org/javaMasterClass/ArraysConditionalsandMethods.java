package org.javaMasterClass;

public class ArraysConditionalsandMethods {
    static String reverse(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {

            System.out.print(s.charAt(i));
        }
        return s;
    }

    static void trim(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            str = s.trim().replace(" ", "");
        }
        String word = str.substring(0);
        String letter = str.substring(0, 1).toUpperCase();
        System.out.println(letter + word);
    }

    static String longestString(String[] strings) {
        String longesString = "";
        String output = "";
        for (String string : strings) {
            if (string.length() > longesString.length()) {
                longesString = string;
                output = string;
                continue;
            }
            if (string.length() == longesString.length()) {
                longesString = string;
                output += ", " + string;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Exercise 1");
        /*
             Write a method that reverses any String and print to console
             Input should be a string
             Output should be reversed input
        */
        reverse("Hello");

        System.out.println();
        System.out.println("Exercise 2");
            /*
                Given the following String input
                String input = "   amig os cod e  "
                Write a method that transforms input into: Amigoscode
            */

        trim("   amig os cod e  ");

        System.out.println();
        System.out.println("Exercise 3");
        /*
            Write a method that finds the longest string in any given array.
            i.e. [] -> ""
            i.e. ["hello", "ola", "bye", "ciao"] -> hello
            i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
            i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
        */

        String str = longestString(new String[]{"hello", "bingo", "ola", "bye", "ciao"});
        System.out.println(str);

    }
}
