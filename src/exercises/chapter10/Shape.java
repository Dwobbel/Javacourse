package exercises.chapter10;

abstract public class Shape {
    public int x;
    public int y;
    private static int count;

    public static int getCount() {
        return count;
    }

    public Shape() {
        this(0, 0);
    }

    public Shape(int x, int y) {
        this.getX();
        this.getY();
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

    abstract public double getArea();
    abstract public double getPerimeter();

}