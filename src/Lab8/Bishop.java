package Lab8;

public class Bishop extends Figure {

    public Bishop(char x, int y) {
        super(x, y);
    }

    @Override
    public void mov() {
        System.out.println("Ходы слона с позиции " + x + y + ":");

        char cx = x; int cy = y;
        while (cx < 'h' && cy < 8) {
            cx++; cy++;
            System.out.print(cx + "" + cy + " ");
        }
        System.out.println();

        cx = x; cy = y;
        while (cx > 'a' && cy < 8) {
            cx--; cy++;
            System.out.print(cx + "" + cy + " ");
        }
        System.out.println();

        cx = x; cy = y;
        while (cx < 'h' && cy > 1) {
            cx++; cy--;
            System.out.print(cx + "" + cy + " ");
        }
        System.out.println();

        cx = x; cy = y;
        while (cx > 'a' && cy > 1) {
            cx--; cy--;
            System.out.print(cx + "" + cy + " ");
        }
        System.out.println();
    }
}
