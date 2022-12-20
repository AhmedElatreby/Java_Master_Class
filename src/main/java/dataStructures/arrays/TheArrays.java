package dataStructures.arrays;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colours = new String[5];
        colours[0] = "white";
        colours[1] = "black";
        colours[2] = "red";
        colours[3] = "pink";
        colours[4] = "green";

        int[] num = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(colours));
        System.out.println(colours[1]);
        for (String colour : colours) {
            System.out.print(colour + ", ");
        }
        System.out.println();
        for (int i : num) {
            System.out.println(i);
        }
        System.out.println("--------- access array with for loop and index ----------------");

        for (int i = 0; i < colours.length; i++) {
            System.out.println(colours[i]);

        }

        System.out.println("----- reverse array -----");

        for (int i = colours.length - 1; i >= 0; i--) {
            System.out.println(colours[i]);
        }

        System.out.println("-------- using stream --------");

        Arrays.stream(colours).forEach(System.out::println);

    }

}
