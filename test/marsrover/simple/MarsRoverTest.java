package marsrover.simple;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static junit.framework.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void should_return_left_direction_after_marsrover_turn_left(){
        MarsRover marsRover = new MarsRover(new Position(3,6),Direction.E);

        marsRover.turnLeft();

        assertEquals(marsRover.status(),"3 6 N");
    }

    @Test
    public void should_return_right_direction_after_marsrover_turn_right(){
        MarsRover marsRover = new MarsRover(new Position(3,6),Direction.E);

        marsRover.turnRight();

        assertEquals(marsRover.status(),"3 6 S");
    }

    @Test
    public void should_return_foward_position_after_marsrover_go_forward() {
        MarsRover marsRover = new MarsRover(new Position(3,6),Direction.E);

        marsRover.goForward();

        assertEquals(marsRover.status(),"4 6 E");
    }
}
