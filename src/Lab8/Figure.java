package Lab8;

public abstract class Figure {
    protected char x;
    protected int y;

    public Figure(char x, int y) {
        this.x = x;
        this.y = y;
    }

    protected boolean U() {
        return y + 1 <= 8;
    }

    protected boolean D() {
        return y - 1 >= 1;
    }

    protected boolean R() {
        return x + 1 <= 'h';
    }

    protected boolean L() {
        return x - 1 >= 'a';
    }

    public abstract void mov();
}
