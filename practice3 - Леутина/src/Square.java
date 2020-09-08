public class Square extends Rectangle {
    protected double side;

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter(){
        return 4 * side;
    }

    public String toString(){
        return "Shape: square, side: " + side + ", color: " + color;
    }
}
