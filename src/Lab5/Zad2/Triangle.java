package Lab5.Zad2;

public class Triangle extends Figure3 {

    public Triangle(double a, double b, double c) {
        super("Треугольник", a, b, c);
    }

    @Override
    public double getArea() {
        double p = (param1 + param2 + param3) / 2.0;
        return Math.sqrt(p * (p - param1) * (p - param2) * (p - param3));
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Площадь: " + getArea());
        System.out.println();
    }
}
