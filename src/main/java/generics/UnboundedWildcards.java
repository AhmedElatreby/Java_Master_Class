package generics;


import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {
    public static void main(String[] args) {
        // ? Wildcards
        // Unbounded Wildcards
        List<Object> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(1, 2);
        List<Object> list3 = Arrays.asList(1, 2,"4");
        print(list1);
        print(list2);
        print(list3);
    }

    static void print(List<?> list){
        list.forEach(System.out::println);
    }
}
