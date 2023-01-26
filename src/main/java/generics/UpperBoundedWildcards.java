package generics;


import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {
    public static void main(String[] args) {
        // ? Wildcards
        // Unbounded Wildcards
        List<Double> list1 = Arrays.asList(1.3, 2.4);
        List<Integer> list2 = Arrays.asList(1, 2);
        List<Number> list4 = Arrays.asList(1,1.2);
       // List<Object> list3 = Arrays.asList(1, 2,"4"); this wont't work as is not a number
        print(list1);
        print(list2);
        print(list4);
        // print(list3);
    }

    static void print(List<? extends  Number> list){
        list.forEach(System.out::println);
    }
}
