public class ShapeMain {
    public static void main(String[] args) {
        ShapeCalculator shape = new ShapeCalculator();

        Square sguare = new Square(5,10);
        System.out.println(shape.sguareArea(sguare));

        Rectangle rectangle = new Rectangle(5,10);
        System.out.println(shape.rectPerimeter(rectangle));

        Circle circle = new Circle(5.0);
        System.out.println(shape.circleArea(circle));

        Triangle triangle = new Triangle(5, 10, 15);
        System.out.println(shape.trianglePerimeter(triangle));







    }
}
