package email;

public class EmailValidator {
     static void emailValidator(String str) {
        if (str.contains("@")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

}
