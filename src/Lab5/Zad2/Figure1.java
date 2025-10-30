package Lab5.Zad2;

public abstract class Figure1 {
    protected double param1;
    private String name;

    public Figure1(String name, double param1) {
        setName(name);
        setParam1(param1);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public double getParam1() {
        return param1;
    }

    public void setParam1(double param1) {
        if (param1 > 0) this.param1 = param1;
        else System.out.println("Параметр 1 должен быть > 0");
    }

    public abstract double getArea();

    public void print() {
        System.out.println("Фигура: " + getName());
        System.out.println("Параметр 1: " + param1);
    }
}
