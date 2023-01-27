package exercises.ArraysConditionalsAndMethods;

public class Main {
    public static void main(String[] args) {
        String myString = "Hello";
        String str = "   amig os cod e  ";
        trimStr(str);
        reverse(myString);
        System.out.println();
        String[] myString1 = {"hello", "bingo", "ola", "bye", "ciao"};

        System.out.println(longestString(myString1));

    }

    static String reverse(String str) {

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.toUpperCase().charAt(i));
        }
        return str;
    }

    static void trimStr(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            s = str.trim().replace(" ", "");
        }
        String letter = String.valueOf(s.charAt(0));
        String word = s.substring(1);
        letter = letter.toUpperCase();
        System.out.println(letter + word);

    }

    static String longestString(String[] strings) {
        String longestString = "";
        String output = "";
        for (String string : strings) {
            if (string.length() > longestString.length()) {
                longestString = string;
                output = string;
                continue;
            }
            if (string.length() == longestString.length()) {
                longestString = string;
                output += "," + string;
            }
        }
        return output;
    }


}
