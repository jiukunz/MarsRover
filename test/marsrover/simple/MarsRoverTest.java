package marsrover.simple;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void should_turn_left_after_get_command_L(){
        MarsRover marsRover = new MarsRover(new Position(3,6),Direction.E);
        marsRover.turnLeft();
        assertEquals(marsRover.getCurDirection(),Direction.N);
        marsRover.turnLeft();
        assertEquals(marsRover.getCurDirection(),Direction.W);
        marsRover.turnLeft();
        assertEquals(marsRover.getCurDirection(),Direction.S);
        marsRover.turnLeft();
        assertEquals(marsRover.getCurDirection(),Direction.E);
    }
    @Test
    public void should_turn_right_after_get_command_R(){
        MarsRover marsRover = new MarsRover(new Position(3,6),Direction.E);
        marsRover.turnLeft();
        assertEquals(marsRover.getCurDirection(),Direction.N);
        marsRover.turnLeft();
        assertEquals(marsRover.getCurDirection(),Direction.W);
        marsRover.turnLeft();
        assertEquals(marsRover.getCurDirection(),Direction.S);
        marsRover.turnLeft();
        assertEquals(marsRover.getCurDirection(), Direction.E);
    }
}
