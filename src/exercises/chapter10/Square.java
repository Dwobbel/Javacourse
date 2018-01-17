package exercises.chapter10;

import exercises.chapter8.Rectangle;

/**
 * Created by KristofB on 17/01/2018.
 */
public class Square extends Rectangle {
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
}
