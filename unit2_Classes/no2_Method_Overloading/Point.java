package unit2_Classes.no2_Method_Overloading;

public class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return x +","+y;
    }
}
