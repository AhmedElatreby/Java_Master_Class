package dataStructures.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedList {

    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Shahd", 9));
        people.add(new Person("Jana", 7));
        people.add(new Person("Sarah", 4));
        people.add(new Person("Yesmine", 4));
        System.out.println(people);

        // introduced local variable
        ListIterator<Person> personListIterator = people.listIterator();
        // while loop to go through the list
        while ( personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println();

        // while loop to go through the list in reverse order
        while ( personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    public record Person(String name, int age) {

    }
}
