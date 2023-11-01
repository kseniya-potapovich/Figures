public class Rectangle extends Figure {
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    void square() {
        square = width * length;
        System.out.println(square);
    }

    @Override
    void perimeter() {
        perimeter = 2 * (width + length);
        System.out.println(perimeter);
    }
}
