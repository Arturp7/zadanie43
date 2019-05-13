public class Rectangle {
    double sideA;
    double sideB;

    Rectangle(double a, double b){
        sideA = a;
        sideB = b;
    }

    double rectanglePerimeter(){
        double result = 2*sideA + 2*sideB;
        return result;

    }
}
