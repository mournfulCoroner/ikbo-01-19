public class MovableRectangle implements Movable {
    private MoveblePoint topLeft;
    private MoveblePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        topLeft = new MoveblePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MoveblePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean checkSpeed(){
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }

    public void moveUp(){
        if(checkSpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }
    public void moveDown(){
        if(checkSpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }
    public void moveLeft(){
        if(checkSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }
    public void moveRight(){
        if(checkSpeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

}
