package dataStructures.stacks;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        // create a stack with Integer data type
        Stack<Integer> stack = new Stack<>();
        // use push to add a number into stack - first in last out (FILO)
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        // to see what is the number in the top of the stack we use peek
        System.out.println("The top number of the stack " + stack.peek());
        // to find out the size of the stack we use .size
        System.out.println("The size of the stack " + stack.size());
        // to delete the top number of the stack we use pop
        System.out.println("delete the top number of the stack " + stack.pop());
        System.out.println("The number of the stack " + stack.size());
        System.out.println("Check if the stack if empty or not: " + stack.isEmpty());
    }
}
