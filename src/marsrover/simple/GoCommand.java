package marsrover.simple;

public class GoCommand extends Command {

    protected GoCommand(MarsRover marsRover) {
        super(marsRover);
    }

    @Override
    public void execute() {
        marsRover.goAhead();
    }
}
