package staticClassVariables;


import staticClassVariables.person.Person;
import staticClassVariables.person.StaticBlockDemo;

public class Main {
    public static void main(String[] args) {

        //Person mark = new staticClassVariables.person.Person("Mark", "Black");
        System.out.println(Person.getNumberOfPeople());

        Person chris = new Person("Tom","Blue");
        Person tom = new Person("Tom","Brown");

        Person.setNumberOfPeople(0);

        Person stephan = new Person("Stephan","Greenish-Brownish-Blueish");

        System.out.println(Person.numberOfPeople);
        // output: 1

        StaticBlockDemo staticBlockDemo = new StaticBlockDemo();

    }
}
