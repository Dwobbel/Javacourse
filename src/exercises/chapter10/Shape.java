package exercises.chapter10;

abstract public class Shape {
    private int x;
    private int y;
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public Shape() {
        this(0, 0);
    }

    public Shape(int x, int y) {
        this.setX(0);
        this.setY(0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x, int y){
        this.x = x<=0?0:x;
        this.y = y<=0?0:y;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}