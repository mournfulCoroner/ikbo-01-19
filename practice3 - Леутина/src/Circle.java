public class Circle extends Shape {
    protected double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public  Circle() {}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString(){
        return "Shape: circle, radius: " + radius + ", color: " + color;
    }
}
