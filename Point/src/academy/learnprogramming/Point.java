package academy.learnprogramming;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0,0);
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

    public double distance() {
        return (Math.sqrt((this.x * this.x) + (this.y * this.y)));
    }

    public double distance(int x, int y) {

        double xSide = ((x-this.x) * (x-this.x));
        double ySide = ((y-this.y) * (y-this.y));

        return Math.sqrt(xSide+ySide);
    }

    public double distance(Point point) {

        double xSide = ((point.x-this.x) * (point.x-this.x));
        double ySide = ((point.y-this.y) * (point.y-this.y));

        return Math.sqrt(xSide+ySide);
    }
}
