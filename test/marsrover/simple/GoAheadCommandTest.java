package marsrover.simple;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GoAheadCommandTest {
    @Test
    public void marsrover_should_go_ahead(){
        Position position = new Position(3,5);
        MarsRover marsRover = new MarsRover(position,Direction.N);
        GoAheadCommand command = new GoAheadCommand(marsRover);
        marsRover.executeCommand(command);
        assertEquals(true,marsRover.getCurPosition().equals((position.nextPosition(Direction.N))));
    }


}
