package Lab5;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Ширина должна быть > 0");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Высота должна быть > 0");
        }
    }

    public double getArea() {
        return width * height;
    }

    public void print() {
        System.out.println("Фигура: Прямоугольник");
        System.out.println("Ширина: " + width);
        System.out.println("Высота: " + height);
        System.out.println("Площадь: " + getArea());
        System.out.println();
    }
}
