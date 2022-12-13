package staticClassVariables.person;


import java.util.LinkedList;
import java.util.List;

public class StaticBlockDemo {
    public static List<String> languages = new LinkedList<>();

    static {
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");
    }

    static {
        languages.add("HTML");
        languages.add("CSS");
    }

}
