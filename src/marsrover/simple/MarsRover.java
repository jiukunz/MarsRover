package marsrover.simple;


public class MarsRover {

    private Position curPosition;
    private Direction curDirection;

    public MarsRover(Position curPosition, Direction curDirection) {
        this.curPosition = curPosition;
        this.curDirection = curDirection;
    }

    public void turnLeft() {
        this.curDirection = this.curDirection.left();
    }

    public void turnRight() {
        this.curDirection = this.curDirection.right();
    }

    public void goAhead() {
        this.curPosition = this.curPosition.nextPosition(this.curDirection);
    }


    public String status() {
        return this.curPosition.getxCoord() +
                " " + this.curPosition.getyCoord() +
                " " + this.curDirection;
    }
}

