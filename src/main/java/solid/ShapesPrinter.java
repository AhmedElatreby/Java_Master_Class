package solid;

import java.util.List;

public class ShapesPrinter {
    public String json(int sum){
        return "{shapes sum: %s}".formatted(sum);
    }

    public String csv(int sum){
        return "shapes_sum, %s".formatted(sum);
    }
}
