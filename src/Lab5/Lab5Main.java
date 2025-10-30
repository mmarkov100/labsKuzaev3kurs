package Lab5;

public class Lab5Main {

    public static void main(String[] args){
        Rectangle rect1 = new Rectangle(4, 6);
        Rectangle rect2 = new Rectangle(3.5, 2.8);

        Triangle tr1 = new Triangle(3, 4, 5);
        Triangle tr2 = new Triangle(6, 7, 8);

        rect1.print();
        rect2.print();

        tr1.print();
        tr2.print();
    }
}
