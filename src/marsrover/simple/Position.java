package marsrover.simple;

public class Position {

    private int xCoord;
    private int yCoord;


    public Position(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    private Position add(Position position) {
        return new Position(this.xCoord + position.xCoord,
                this.yCoord + position.yCoord);
    }

    public Position nextPosition(Direction direction) {
        return this.add(direction.getExtraPosition());
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }
}

