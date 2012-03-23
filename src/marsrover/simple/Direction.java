package marsrover.simple;

public enum Direction {

    N("W","E",new Position(0,1)),
    E("N","S",new Position(1,0)),
    S("E","W",new Position(0,-1)),
    W("S","N",new Position(-1,0));

    private String left;
    private String right;
    private Position extraPosition;

    private Direction(String left,String right,Position extraPosition){
        this.left = left;
        this.right = right;
        this.extraPosition = extraPosition;

    }

    public Direction turnLeft(){
        return Direction.valueOf(this.left);
    }

    public Direction turnRight(){
        return Direction.valueOf(this.right);
    }

    public Position getExtraPosition(){
        return this.extraPosition;
    }

}
