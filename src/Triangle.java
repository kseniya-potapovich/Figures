public class Triangle extends Figure {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void square() {
        square = (((a + b + c) / 2) * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c));
        System.out.println(Math.sqrt(square));
    }

    @Override
    void perimeter() {
        perimeter = a + b + c;
        System.out.println(perimeter);
    }
}
