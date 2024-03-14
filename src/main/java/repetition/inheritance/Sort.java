package repetition.inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Sort {
    public static void sortShapes(Shape[] array,
                                  List<Shape> shapes,
                                  List<Polygon> polygons,
                                  List<Square> squares,
                                  List<Circle> circles) {
        Map map = Arrays.stream(array).collect(Collectors.groupingBy(Shape::getClass));
        shapes.addAll((List<Shape>) map.get(Shape.class));
        polygons.addAll((List<Polygon>) map.get(Polygon.class));
        squares.addAll((List<Square>) map.get(Square.class));
        circles.addAll((List<Circle>) map.get(Circle.class));
    }

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        ArrayList<Polygon> polygons = new ArrayList<>();
        ArrayList<Square> squares = new ArrayList<>();
        ArrayList<Circle> circles = new ArrayList<>();
        sortShapes(new Shape[]{new Circle(), new Polygon(), new Shape(), new Polygon(), new Square()},
                shapes,
                polygons,
                squares,
                circles
        );
        System.out.println(polygons);
    }
}


class Polygon extends Shape {
}


