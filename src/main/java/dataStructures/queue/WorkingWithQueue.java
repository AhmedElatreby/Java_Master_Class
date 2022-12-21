package dataStructures.queue;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        // First in First Out (FIFO)
        // create a queue with Person type
        Queue<Person> queue = new LinkedList<>();

        // use add to add a person
        queue.add(new Person("Shahd", 9));
        queue.add(new Person("Jana", 7));
        queue.add(new Person("Sarah", 4));
        queue.add(new Person("Yesmine", 4));
        // use peek to see the first person
        System.out.println("The first person in the queue: " + queue.peek());
        // use .size to find out the size of the queue
        System.out.println("size of persons in the queue: " + queue.size());
        // use .poll to delete the first person of the queue
        System.out.println("remove the first person in the queue: " + queue.poll());
        System.out.println("The first person in the queue: " + queue.peek());
        System.out.println("size of persons in the queue: " + queue.size());



        // to see what is the number in the top of the stack we use peek
//        System.out.println("The top number of the stack " + stack.peek());
        // to find out the size of the stack we use .size
//        System.out.println("The size of the stack " + stack.size());
        // to delete the top number of the stack we use pop
//        System.out.println("delete the top number of the stack " + stack.pop());
//        System.out.println("The number of the stack " + stack.size());
//        System.out.println("Check if the stack if empty or not: " + stack.isEmpty());

    }
    public record Person(String name, int age){

    }
}
