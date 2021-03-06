package exercises.chapter10;

import exercises.chapter10.Shape;

import java.util.Objects;

public class Triangle extends Shape {
    private int w;
    private int h;
    private int p;
    private static int count = 0;
    public static final int ANGLES = 3;

    static {count = 0;}

    public static int getCount() {
        return count;
    }

    public Triangle(){
        this(0,0,0);
    }

    public Triangle(int w, int h, int p){
        this(0,0,0,0,0);
        setW(w);
        setH(h);
        setP(p);
    }
    public Triangle(int w, int h, int p, int x, int y){
        super(x, y);
        this.w=w;
        this.h=h;
        this.p=p;
        count++;
    }
    public Triangle(Triangle triangle){
        this(triangle.getW(),triangle.getH(),triangle.getP(),triangle.getX(), triangle.getY());
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }
    public double getArea() {
        return this.w*this.h/2;
    }
    public double getPerimeter() {
        double hypotenuse = Math.pow(Math.pow(w, 2) + Math.pow(h, 2),0.5);
        double perimeter = w + h + hypotenuse;
        return perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return getW() == triangle.getW() &&
                getH() == triangle.getH() &&
                getP() == triangle.getP();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getW(), getH(), getP());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "w=" + w +
                ", h=" + h +
                ", p=" + p +
                "} ";
    }
}
