package exercises.chapter8;

import exercises.chapter10.Shape;

/**
 * Created by KristofB on 6/12/2017.
 */
public class Circle extends Shape {
    private int x;
    private int y;
    private static int count;
    private static final int ANGLES;
    private int radius;

    static {
        count = 0;
        ANGLES = 0;
    }

    public Circle() {
        this(0,0,0);
 }

    public Circle(int radius) {
        this(0,0,0);
    }

    public Circle(int radius, int x, int y) {
        setRadius(radius);
        setX(x);
        setY(y);
        count++;
    }

    public Circle(Circle circle) {
        this(circle.getRadius(), circle.getX(), circle.getY());
    }
    public void setPosition(int x, int y){
        this.x = x<=0?0:x;
        this.y = y<=0?0:y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setRadius(int radius){ this.radius = radius;};

    public int getX() {return x;}
    public int getY() {return y;}
    public int getRadius(){return radius;}

    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getPerimeter() {
        return (radius*Math.PI)*2;
    }

    public void grow(int d){
        d = d<0?-d:d;
        this.radius = this.radius+d;
    }
    public static int getCount() {
        return count;
    }
}