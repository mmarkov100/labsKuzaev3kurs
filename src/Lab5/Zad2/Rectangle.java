package Lab5.Zad2;

public class Rectangle extends Figure2 {

    public Rectangle(double width, double height) {
        super("Прямоугольник", width, height);
    }

    @Override
    public double getArea() {
        return param1 * param2;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Площадь: " + getArea());
        System.out.println();
    }
}
