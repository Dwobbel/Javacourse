package solutions.javabasics.chapter10.exercise10;


public class Drawing {
    private Shape[] shapes = new Shape[100];
    private int size = 0;

    public void add(Shape shape) {
        if (shape == null || isPresent(shape)) {
            return;
        }
        int vrij = getFreeLocation();
        if (vrij > -1) {
            shapes[vrij] = shape;
            size++;
        }
    }

    public void remove(Shape shape) {
        if (shape == null) {
            return;
        }
        for (int i = 0; i < shapes.length; i++) {
            if (shape.equals(shapes[i])) {
                shapes[i] = null;
                size--;
                return;
            }
        }
    }

    private boolean isPresent(Shape shape) {
        if (shape == null) {
            return false;
        }
        for (int i = 0; i < shapes.length; i++) {
            if (shape.equals(shapes[i])) {
                return true;
            }
        }
        return false;
    }

    private int getFreeLocation() {
        //return -1; //bij -1 zit de array vol
        for (int i = 0; i < shapes.length; i++)
            if (shapes[i] == null) {
                return i;
            } else {
                int HuidigeLengte = shapes.length;
                Shape[] NewShapes = new Shape[HuidigeLengte + 1];
                NewShapes[i] = shapes[i];
                return NewShapes.length;
            }
        return -1;
    }

    private void clear() {
        for (Shape shape : shapes) {
            shapes = new Shape[100];
            size = 0;
        }
    }

    public int getSize() {
        return size;
    }
}
