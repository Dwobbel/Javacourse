package exercises.chapter8;

/**
 * Created by KristofB on 22/11/2017.
 */
public class Rectangle {
    public int x;
    public int y;
    public int height;
    public int width;

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void growth(int d){
        this.width = this.width + d;
        this.height = this.height + d;
    }
    public double getArea() {
        return height*width;
    }
    public double getPerimeter() {
        return (height+width)*2;
    }
}
