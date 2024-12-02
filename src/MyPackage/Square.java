package MyPackage;

class Square extends Rectangle {
    Square() {
        super();
    }

    Square(double side) {
        super(side, side);
    }

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "Shape: Square, side=" + getWidth() + ", color=" + getColor() + ", filled=" + isFilled();
    }
}