package generics;

import java.util.ArrayList;
import java.util.List;


public class Example1 {
    public static void main(String[] args) {
        List <Integer>numbers = new ArrayList();
        numbers.add(1);
        numbers.add(Integer.valueOf("2"));
        for (Object number: numbers) {
            System.out.println( number);
           }
    }
}
