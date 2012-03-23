package marsrover.simple;

import marsrover.simple.Direction;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectionTest {
    private Direction direction;

    @Before
    public void setUp() {
        direction = Direction.N;
    }

    @Test
    public void should_turn_left() {
        direction = direction.turnLeft();
        assertEquals(Direction.W, direction);
        direction = direction.turnLeft();
        assertEquals(Direction.S, direction);
        direction = direction.turnLeft();
        assertEquals(Direction.E, direction);
        direction = direction.turnLeft();
        assertEquals(Direction.N, direction);
    }

    @Test
    public void should_turn_right() {
        direction = direction.turnRight();
        assertEquals(Direction.E, direction);
        direction = direction.turnRight();
        assertEquals(Direction.S, direction);
        direction = direction.turnRight();
        assertEquals(Direction.W, direction);
        direction = direction.turnRight();
        assertEquals(Direction.N, direction);
    }

}
