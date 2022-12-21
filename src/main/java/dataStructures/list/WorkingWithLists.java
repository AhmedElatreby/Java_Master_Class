package dataStructures.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {

        // create ArrayList
        List<String> colors = new ArrayList<>();
        // add to the list
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("red"));
        System.out.println(colors.contains(""));


        // loop through the list
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println();
        // or use forEach
        System.out.println("     forEach     ");
        colors.forEach(System.out::println);
        System.out.println("  for i   ");

        // or
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // add item into 1st index of array
        colors.add(0, "something");
        // get the 1st index of array
        System.out.println(colors.get(1));
        // updated index in the array
        colors.set(0, "Green");
        System.out.println(colors);
        // remove an element from the array
        colors.remove(0);
        System.out.println(colors);

        // search if the array contain an element
        if (colors.contains("red")) {
            System.out.println("found the element");
        } else {
            System.out.println("There is no such element");
        }
        // sort array
        Collections.sort(colors);
        System.out.println(colors);

        // copy arrayList
        List<String> colorCopy = new ArrayList<>();
        colorCopy.add("a");
        colorCopy.add("b");
        colorCopy.add("c");
        colorCopy.add("d");
        colorCopy.add("e");
        System.out.println(colorCopy);
        // revers order in array
        Collections.reverse(colorCopy);
        System.out.println(colorCopy);
        Collections.copy(colorCopy, colors);
        System.out.println(colorCopy);
        // shuffle items in an array
        Collections.shuffle(colorCopy);
        System.out.println(colorCopy);

        // extract a portion of an array list
        List<String> subList = colorCopy.subList(0, 3);
        System.out.println(subList);
        // compare two array lists
        boolean isEqual = colors.equals(colorCopy);
        System.out.println(isEqual);

        //swap two elements in an array list

         Collections.swap(colorCopy, 0,2);
        System.out.println(colorCopy);

        //  join two array lists
        colorCopy.addAll(colors);
        System.out.println(colorCopy);

        // or by creating a new list and add the other two lists inside it
        List<String> c = new ArrayList<>();
        c.addAll(colorCopy);
        c.addAll(colors);
        System.out.println(c);
        // clone an array list to another array list
        ArrayList<String> c2 =  (ArrayList<String>) ((ArrayList<String>) c).clone();
        System.out.println(c2);
        // empty an array list.
        c2.removeAll(c2);
        System.out.println(c2);
        // test an array list is empty or not
        System.out.println(c2.isEmpty());
        System.out.println(c.isEmpty());
        // trim the capacity of an array list the current list size
        ((ArrayList<String>) c).trimToSize();
        System.out.println(c);
        ((ArrayList<String>) c).ensureCapacity(5);
        System.out.println(c);


    }

}
