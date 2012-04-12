package marsrover.simple;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static junit.framework.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void should_return_left_direction_after_marsrover_turn_left(){
        MarsRover marsRover = new MarsRover(new Position(3,6),Direction.E);

        assertEquals(marsRover.turnLeft(),Direction.N);
        assertEquals(marsRover.turnLeft(),Direction.W);
        assertEquals(marsRover.turnLeft(),Direction.S);
        assertEquals(marsRover.turnLeft(),Direction.E);
    }

    @Test
    public void should_return_right_direction_after_marsrover_turn_right(){
        MarsRover marsRover = new MarsRover(new Position(3,6),Direction.E);

        assertEquals(marsRover.turnRight(),Direction.S);
        assertEquals(marsRover.turnRight(),Direction.W);
        assertEquals(marsRover.turnRight(),Direction.N);
        assertEquals(marsRover.turnRight(), Direction.E);
    }

    @Test
    public void should_return_foward_position_after_marsrover_go_forward() {
        MarsRover marsRover = new MarsRover(new Position(3,6),Direction.E);

        assertThat(marsRover.goForward().getxCoord(),is(4));
    }
}
