package marsrover.simple;

public class MarsRover {

    private Position curPosition;
    private Direction curDirection;

    public Position getCurPosition() {
        return curPosition;
    }

    public Direction getCurDirection() {
        return curDirection;
    }

    public MarsRover(Position curPosition, Direction curDirection) {
        this.curPosition = curPosition;
        this.curDirection = curDirection;
    }

    public void executeCommand(Command command) {
        command.execute();
    }

    public void turnLeft() {
        this.curDirection = this.curDirection.turnLeft();
    }

    public void turnRight() {
        this.curDirection = this.curDirection.turnRight();
    }

    public void goAhead() {
            this.curPosition = this.curPosition.nextPosition(this.curDirection);
    }


    public void status() {
        System.out.println(
                this.curPosition.getxCoord() +
                        " " + this.curPosition.getyCoord() +
                        " " + this.curDirection
        );
    }
}

