package solid;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Rectangle rectangle= new Rectangle();
        ShapesPrinter shapesPrinter = new ShapesPrinter();

        List<Shape> shapes = List.of(circle, square, cube, rectangle);
        int sum = areaCalculator.sum(shapes);
        System.out.println(shapesPrinter.json(sum));
        System.out.println(shapesPrinter.csv(sum));
    }
}
