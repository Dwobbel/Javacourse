package exercises.chapter10;

import exercises.chapter10.Triangle;

public class IsoScelestriangle extends Triangle {
    private static int count;

    public static int getCount() {
        return count;
    }

    public IsoScelestriangle(){
        this(0,0);
    }
    public IsoScelestriangle(int w, int h){
        this(0,0,0,0);
        setW(w);
        setH(h);
    }
    public IsoScelestriangle(int w, int h, int x, int y){
        super(w, h, h, x, y);
        count++;
    }

    public IsoScelestriangle(IsoScelestriangle isoScelestriangle) {
        this(isoScelestriangle.getW(),isoScelestriangle.getH(), isoScelestriangle.getX(), isoScelestriangle.getY());
    }

    public void setW(int w){
        super.setW(w);
    }

    public void setP(int p){
        super.setP(p);
    }



}
