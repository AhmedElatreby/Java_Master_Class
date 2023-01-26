package generics;

public class BoundTypeParameter {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5};
        System.out.println(countGreaterThan(numbers,3));

        Double[] numbers1 = {1.2,2.1,3.1,4.5,5.4};
        System.out.println(countGreaterThan(numbers1,3.0));

    }

    interface A {}
    interface B {}

    static <T extends Comparable <T>>  int countGreaterThan(T[] numbers, T number) {
        int count = 0;
        for (T n: numbers) {
            if (n.compareTo(number) >0) {
                count++;
            }
        }
        return count;
    }
}
