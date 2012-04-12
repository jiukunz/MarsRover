package marsrover.simple;


public class MarsRover {

    private Position curPosition;
    private Direction curDirection;

    public MarsRover(Position curPosition, Direction curDirection) {
        this.curPosition = curPosition;
        this.curDirection = curDirection;
    }

    public Direction turnLeft() {
        this.curDirection = this.curDirection.left();
        return this.curDirection;
    }

    public Direction turnRight() {
        this.curDirection = this.curDirection.right();
        return this.curDirection;
    }

    public Position goForward() {
        this.curPosition = this.curPosition.nextPosition(this.curDirection);
        return this.curPosition;
    }


    public String status() {
        return this.curPosition.getxCoord() +
                " " + this.curPosition.getyCoord() +
                " " + this.curDirection;
    }
}

