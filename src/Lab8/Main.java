package Lab8;

public class Main {
    public static void main(String[] args) {

        Bishop bishop = new Bishop('c', 1);
        bishop.mov();
        System.out.println();

        BlackPawn pawn = new BlackPawn('d', 7);
        pawn.mov();
        System.out.println();

        Bishop bishop2 = new Bishop('a', 1);
        bishop2.mov();

        BlackPawn pawn2 = new BlackPawn('h', 2);
        pawn2.mov();
    }
}
