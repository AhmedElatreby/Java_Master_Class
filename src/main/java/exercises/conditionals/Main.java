package exercises.conditionals;

public class Main {
    public static void main(String[] args) {
        
        // Question 1
        int number1 = 10;
        int number2 = 10;
        if (number1 == number2) {
            System.out.println("Number1 is equal number2");
        }
        System.out.println();

        // Question 2
        String s1 = "hi";
        String s2 = "hi";
        if (s1 ==s2) {
            System.out.println("s1 is equal s2");
        }
        System.out.println();

        // Question 3

        s1 = new String("hello");
        s2 = new String("hello");
        if (s1.equals(s2)) {
            System.out.println("They are the same");
        }
        System.out.println();

        // Question 4
        int num1 = 5;
        int num2 = 9;
        if (num1 > num2) {
            System.out.println("Num1 is greater than num2");
        }else {
            System.out.println("Num1 is NOT greater than num2");
        }
        System.out.println();

        // Question 5
        int n1 = 8;
        int n2 = 5;
        int n3 = 9;
        if ((n1 > n2) && (n1< n3)) {
            System.out.println("n1 is grater than n2 and less than n3");
        } else {
            System.out.println("n1 is NOT grater than n2 and less than n3");
        }
        System.out.println();

        // Question 6
        String str1 = "hello";
        if (str1.charAt(0) == 'h') {
            System.out.println("they are the same");
        }
        System.out.println();

        // Question 7
        String str01 = "Hello";
        for (int i = 0; i < str01.length(); i++) {
            if (str01.charAt(i) == 'l') {
                System.out.println("Found 'l' at index " + i);
            }

        }
        System.out.println();

        // Question
        for (int i = 0; i < 20 ; i+=1) {
            System.out.println(i);

        }


    }
}
