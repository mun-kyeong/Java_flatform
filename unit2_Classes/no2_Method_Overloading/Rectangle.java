package unit2_Classes.no2_Method_Overloading;

public class Rectangle {
    private Point p1;
    private Point p2;

    public Rectangle(Point p1, Point p2){
        this.setP1(p1);
        this.setP2(p2);

    }

    public void moveBy(int x, int y){
        setP1(new Point(getP1().getX() +x, getP1().getY()+y));
        setP2(new Point(getP2().getX() +x, getP2().getY()+y));
    }

    public void moveBy(int poisiton){
        setP1(new Point(getP1().getX() +poisiton, getP1().getY()+poisiton));
        setP2(new Point(getP2().getX() +poisiton, getP2().getY()+poisiton));


    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Rectangle[(" +
                p1 +
                "), (" + p2 +
                ")]";
    }
}
