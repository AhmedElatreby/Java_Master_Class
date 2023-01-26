package streams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class WorkingWithStreams {
    public static void main(String[] args) {

    }
    @Test
    void streams(){
        List<String> names = List.of("Ahmed", "Shahd", "Jana");
        Stream<String> stream = names.stream();

    }

}
