package exercises.chapter10;

import exercises.chapter8.Rectangle;

/**
 * Created by KristofB on 17/01/2018.
 */
public class Square extends Rectangle {

    private static int count = 0;
    {count++;}

    public static int getCount() {
        return count;
    }

    public Square(){
        this(0);
    }

    public Square (int s){
    this(s, 0, 0);
    }

    public Square (int s, int x, int y) {
        super(s, s, x, y);
    }

    public Square(Square square){
        this(square.getSide(), square.getX(), square.getY());
    }

    @Override
    public void setHeight(int h) {
        setSide(h);
    }
    @Override
    public void setWidth(int w){
        setSide(w);
    }

    public int getSide() {
        return getHeight();
    }

    public void setSide(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
