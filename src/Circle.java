public class Circle extends Figure {
    double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void square() {
        square = pi * radius * radius;
        System.out.println(square);
    }

    @Override
    void perimeter() {
        perimeter = 2 * pi * radius;
        System.out.println(perimeter);
    }
}
