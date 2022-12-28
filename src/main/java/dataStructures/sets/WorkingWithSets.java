package dataStructures.sets;

import java.util.*;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("red"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("red"));
        balls.add(new Ball("blue"));
        balls.remove("red");

        System.out.println(balls.size()); // sets don't take repeated items
        balls.forEach(System.out::println);
        System.out.println(balls.contains("blue"));

    }
    record Ball(String color){

    }
}
