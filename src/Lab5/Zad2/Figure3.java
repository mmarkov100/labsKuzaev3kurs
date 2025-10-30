package Lab5.Zad2;

public abstract class Figure3 extends Figure2 {
    protected double param3;

    public Figure3(String name, double param1, double param2, double param3) {
        super(name, param1, param2);
        setParam3(param3);
    }

    public double getParam3() {
        return param3;
    }

    public void setParam3(double param3) {
        if (param3 > 0) this.param3 = param3;
        else System.out.println("Параметр 3 должен быть > 0");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Параметр 3: " + param3);
    }
}
