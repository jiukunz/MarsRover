package marsrover.simple;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TurnRightCommandTest {
    @Test
    public void testExecute() throws Exception {
        MarsRover marsRover = new MarsRover(new Position(3,5),Direction.N);
        TurnRightCommand turnRightCommand = new TurnRightCommand(marsRover);
        marsRover.executeCommand(turnRightCommand);
        assertEquals(Direction.E,marsRover.getCurDirection());
        marsRover.executeCommand(turnRightCommand);
        assertEquals(Direction.S,marsRover.getCurDirection());
        marsRover.executeCommand(turnRightCommand);
        assertEquals(Direction.W,marsRover.getCurDirection());
        marsRover.executeCommand(turnRightCommand);
        assertEquals(Direction.N,marsRover.getCurDirection());
    }
}
