public class Triangle {
    double sideA;
    double sideB;
    double sideC;

    Triangle(double a, double b, double c){
        sideA = a;
        sideB = b;
        sideC = c;

    }
    double trianglePerimeter(){
    double  result = sideA + sideB + sideC;
    return result;
    }


}
