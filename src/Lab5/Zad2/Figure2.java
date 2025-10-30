package Lab5.Zad2;

public abstract class Figure2 extends Figure1 {
    protected double param2;

    public Figure2(String name, double param1, double param2) {
        super(name, param1);
        setParam2(param2);
    }

    public double getParam2() {
        return param2;
    }

    public void setParam2(double param2) {
        if (param2 > 0) this.param2 = param2;
        else System.out.println("Параметр 2 должен быть > 0");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Параметр 2: " + param2);
    }
}
