public class Ball {

    private double radius;
    private String color;
    private boolean jumpingAbility;

    public Ball(double radius, String color, boolean jumpingAbility) {
        this.radius = radius;
        this.color = color;
        this.jumpingAbility = jumpingAbility;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isJumpingAbility() {
        return jumpingAbility;
    }

    public void setJumpingAbility(boolean jumpingAbility) {
        this.jumpingAbility = jumpingAbility;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", jumpingAbility=" + jumpingAbility +
                '}';
    }
}
