package academy.learnprogramming;

public class Wall {

    private double height;
    private double width;

    public Wall(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return this.width * this.height;
    }
}
