package marsrover.simple;

public abstract class Command {
    protected MarsRover marsRover;

    protected Command(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    public abstract void execute();
}
