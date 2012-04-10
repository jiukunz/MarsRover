package marsrover.simple;

public class MarsRoverFactory {
    //ToDo:可以考虑传入MarsRoverInitConfig对象来构造
    public MarsRover createMarsRover(String initMessage){
        String[] marsRoverInitConfig = Util.splitStringWithBlank(initMessage);
        int xCoord = Integer.parseInt(marsRoverInitConfig[0]);
        int yCoord = Integer.parseInt(marsRoverInitConfig[1]);
        Position position = new Position(xCoord,yCoord);
        Direction direction = Direction.valueOf(marsRoverInitConfig[2]);
        MarsRover marsRover = new MarsRover(position,direction);
        return marsRover;
    }
}