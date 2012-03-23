package marsrover.simple;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TurnLeftCommandTest {
    @Test
    public void marsrover_should_turn_left() {
        MarsRover marsRover = new MarsRover(new Position(3,5),Direction.N);
        TurnLeftCommand turnLeftCommand = new TurnLeftCommand(marsRover);
        marsRover.executeCommand(turnLeftCommand);
        assertEquals(Direction.W,marsRover.getCurDirection());
        marsRover.executeCommand(turnLeftCommand);
        assertEquals(Direction.S,marsRover.getCurDirection());
        marsRover.executeCommand(turnLeftCommand);
        assertEquals(Direction.E,marsRover.getCurDirection());
        marsRover.executeCommand(turnLeftCommand);
        assertEquals(Direction.N,marsRover.getCurDirection());
    }
}
