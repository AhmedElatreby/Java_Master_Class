package exercises.ArraysConditionalsAndMethods;

public class Main {
    public static void main(String[] args) {
        String myString = "Hello";
        reverse(myString);

    }
     static String reverse(String str) {

        for (int i = str.length() -1; i >= 0; i--) {
            System.out.print(str.toUpperCase().charAt(i));
        }
        return str;
    }
}
