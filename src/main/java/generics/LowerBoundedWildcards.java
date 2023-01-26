package generics;


import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcards {
    public static void main(String[] args) {
        // ? Wildcards
        // Lower bounded Wildcards  (super)
        List<Double> list1 = Arrays.asList(1.3, 2.4); // not going to work
        List<Integer> list2 = Arrays.asList(1, 2);
        List<Number> list3 = Arrays.asList(1, 1.2);

//        print(list1);
        print(list2);
        print(list3);

    }

    static void print(List<? super Integer> list) {
        list.forEach(System.out::println);
    }
}
