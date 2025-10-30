package Lab8;

public class BlackPawn extends Figure {

    public BlackPawn(char x, int y) {
        super(x, y);
    }

    @Override
    public void mov() {
        System.out.println("Ходы черной пешки с позиции " + x + y + ":");

        if (D()) {
            System.out.print(x + "" + (y - 1) + " ");
        }
        if (y == 7 && y - 2 >= 1) {
            System.out.print(x + "" + (y - 2) + " ");
        }

        System.out.println();
    }
}
