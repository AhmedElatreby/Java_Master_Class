package email;

import static email.EmailValidator.emailValidator;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Create a package called email and inside create a class called EmailValidator with one public method.\n" +
                "This method should accept a string and perform some validation checking.\n" +
                "If the email does not contain the @ symbol for instance, return false; if the email is valid return true.\n" +
                "Call this method from your Main method which should be outside the package you have just created\n" +
                "Now change the your public method to private and try to run. What happens?\n" +
                "Do the same but this time change your method to have no access modifier\n");
        emailValidator("email@yahoo.com");

    }
}
