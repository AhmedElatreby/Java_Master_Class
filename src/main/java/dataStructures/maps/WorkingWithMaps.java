package dataStructures.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Alex"), new Diamond("di"));
        System.out.println(map.get(new Person("Alex")));
        System.out.println(map.values());
        System.out.println(new Person("Ahmed").hashCode());
        System.out.println(new Person("Ahmed").hashCode());

    }


    private static void maps() {
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
        map.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });
    }

    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

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

    record Diamond(String name) {
    }


}
