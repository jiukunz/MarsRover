package marsrover.simple;

public class MarsRover {

    private Plateau plateau;
    private Position curPosition;
    private Direction curDirection;

    public Position getCurPosition() {
        return curPosition;
    }

    public Direction getCurDirection() {
        return curDirection;
    }

    public void jumpToPlateau(Plateau plateau) {
        this.plateau = plateau;
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
        if(cliffIsInFront()){
            System.out.println("Edge Warming!" + "(" + this.curPosition.getxCoord() + "," + this.curPosition.getyCoord() + ")");
        } else {
            this.curPosition = this.curPosition.nextPosition(this.curDirection);
        }
    }

    private boolean cliffIsInFront() {
        if(null == plateau) {
            System.out.println("MarsRover is not on the plateau.");
            System.exit(-1);
        }
        Position nextPosition = this.curPosition.nextPosition(this.curDirection);
        if (nextPosition.getxCoord() == plateau.getLength()
                || nextPosition.getyCoord() == plateau.getWidth()
                || nextPosition.getxCoord() < 0
                || nextPosition.getyCoord() < 0) {
            return true;
        } else {
            return false;
        }
    }

    public void status() {
        System.out.println(
                this.curPosition.getxCoord() +
                        " " + this.curPosition.getyCoord() +
                        " " + this.curDirection
        );
    }
}

