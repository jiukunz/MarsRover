package marsrover.simple;

public class TurnLeftCommand extends Command {

    protected TurnLeftCommand(MarsRover marsRover) {
        super(marsRover);
    }

    @Override
    public void execute() {
        marsRover.turnLeft();
    }
}
