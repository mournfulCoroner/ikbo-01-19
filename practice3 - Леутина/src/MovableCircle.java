public class MovableCircle implements Movable {
    private int radius;
    private  MoveblePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MoveblePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp(){
        center.moveUp();
    }
    public void moveDown(){
        center.moveDown();
    }
    public void moveLeft(){
        center.moveLeft();
    }
    public void moveRight(){
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovebleCircle{" +
                "x=" + center.x +
                ", y=" + center.y +
                ", radius=" + radius +
                '}';
    }
}
