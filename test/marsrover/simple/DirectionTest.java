package marsrover.simple;

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
        direction = direction.left();
        assertEquals(Direction.W, direction);
        direction = direction.left();
        assertEquals(Direction.S, direction);
        direction = direction.left();
        assertEquals(Direction.E, direction);
        direction = direction.left();
        assertEquals(Direction.N, direction);
    }

    @Test
    public void should_turn_right() {
        direction = direction.right();
        assertEquals(Direction.E, direction);
        direction = direction.right();
        assertEquals(Direction.S, direction);
        direction = direction.right();
        assertEquals(Direction.W, direction);
        direction = direction.right();
        assertEquals(Direction.N, direction);
    }

}
