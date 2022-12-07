package classesNobjects.objects.person;

public class PersonService {
    public int addPerson(Person person) {
        if (person.getFirstName().isBlank()) {
            throw new IllegalStateException("First name cannot be blank or empty");
        }
        return 1;
    }
}
