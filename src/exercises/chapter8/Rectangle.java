package exercises.chapter8;

import exercises.chapter10.Shape;

import java.util.Objects;

/**
 * Created by KristofB on 22/11/2017.
 */
public class Rectangle extends Shape {
    public int x;
    public int y;
    public int height;
    public int width;
    private static int count;
    public static final int ANGLES;

    static {
        count = 0;
        ANGLES = 4;
    }

    public static int getCount() {
        return count;
    }

    public Rectangle() {
        this(0,0);
    }

    public Rectangle(int width, int height) {
        this(0,0,0,0);
        setWidth(width);
        setHeight(height);
    }
    public Rectangle(int width, int height, int x, int y) {
        setWidth(width);
        setHeight(height);
        setX(x);
        setY(y);
        count++;
    }
    public Rectangle(Rectangle rectangle) {
        this(rectangle.getWidth(),rectangle.getHeight(), rectangle.getX(), rectangle.getY());
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
    public void setWidth(int width){
        this.width = width<0?-width:width;
    }
    public void setHeight(int height){
        this.height = height<0?-height:height;
    }
    public void grow(int d){
        //this.width = Math.abs(this.width) + Math.abs(d);
        //this.height = Math.abs(this.height) + Math.abs(d);
        d = d<0?-d:d;
        this.width = this.width+d;

        this.height = this.height+d;
    }
    public double getArea() {
        return height*width;
    }
    public double getPerimeter() {
        return (height+width)*2;
    }
    public int getWidth() {return width;}
    public int getHeight() {return height;}
    public int getX() {return x;}
    public int getY() {return y;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getX() == rectangle.getX() &&
                getY() == rectangle.getY() &&
                getHeight() == rectangle.getHeight() &&
                getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getHeight(), getWidth());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

}
