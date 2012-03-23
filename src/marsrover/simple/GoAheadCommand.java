package marsrover.simple;

public class GoAheadCommand extends Command {

    protected GoAheadCommand(MarsRover marsRover) {
        super(marsRover);
    }

    @Override
    public void execute() {
        marsRover.goAhead();
    }
}
