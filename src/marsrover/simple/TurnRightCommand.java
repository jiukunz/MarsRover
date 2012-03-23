package marsrover.simple;

public class TurnRightCommand extends Command {

    protected TurnRightCommand(MarsRover marsRover) {
        super(marsRover);
    }

    @Override
    public void execute() {
        marsRover.turnRight();
    }
}
