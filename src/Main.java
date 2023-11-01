public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(5, 8);
        Circle circle = new Circle(6);

        System.out.println("Треугольник:");
        triangle.square();
        triangle.perimeter();

        System.out.println("Прямоугольник:");
        rectangle.square();
        rectangle.perimeter();

        System.out.println("Круг:");
        circle.square();
        circle.perimeter();
    }
}
