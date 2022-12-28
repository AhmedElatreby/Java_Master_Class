package dataStructures.maps;

import java.util.*;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Ahmed"));
        map.put(1, new Person("Ahmed"));// it will ignored
        map.put(6, new Person("Ahmed"));// key needs to be unique
        map.put(2, new Person("Shahd"));
        map.put(3, new Person("Jana"));
        map.put(4, new Person("Sarah"));
        map.put(5, new Person("Yesmine"));

        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(9));
        System.out.println(map.containsValue("Hello"));
        System.out.println(map.containsValue("Ahmed"));
        System.out.println(map);
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        map.remove(3);
        map.put(3, new Person("Jana"));
        System.out.println();
        System.out.println(map.values());

        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        System.out.println();
        map.forEach((key, person)-> {
            System.out.println(key + " - " + person);
        });
    }
    record Person(String name){
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

}
