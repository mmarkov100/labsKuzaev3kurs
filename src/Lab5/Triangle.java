package Lab5;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
    }

    public double getA() { return a; }

    public void setA(double a) {
        if (a > 0) this.a = a;
        else System.out.println("Сторона A должна быть > 0");
    }

    public double getB() { return b; }

    public void setB(double b) {
        if (b > 0) this.b = b;
        else System.out.println("Сторона B должна быть > 0");
    }

    public double getC() { return c; }

    public void setC(double c) {
        if (c > 0) this.c = c;
        else System.out.println("Сторона C должна быть > 0");
    }

    public double getArea() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void print() {
        System.out.println("Фигура: Треугольник");
        System.out.println("Стороны: a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Площадь: " + getArea());
        System.out.println();
    }
}
