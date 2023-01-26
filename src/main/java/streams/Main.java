package streams;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
             new Person("Smith", Gender.FEMALE),
             new Person("Anna", Gender.FEMALE),
             new Person("Alex", Gender.MALE),
             new Person("Oliver", Gender.MALE)
        );


    }
}
