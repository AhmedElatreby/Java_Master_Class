package oop.inheritance;

public class Main {
    public static void main(String[] args) {
        String[] languages = {"java", "go", "C++"};
        Programmer java = new Programmer("Ahmed", 41, "Bournemouth", "Backend ", languages);

//        System.out.println(java);

        java.sayHi();

    }
}
