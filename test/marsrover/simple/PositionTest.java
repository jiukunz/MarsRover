package marsrover.simple;

import marsrover.simple.Direction;
import marsrover.simple.Position;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PositionTest {
    @Test
    public void should_be_next_position_of_exact_direction() {
        Position position = new Position(3, 5);
        assertEquals(true, (new Position(3, 6)).equals(position.nextPosition(Direction.N)));
        assertEquals(true, (new Position(4, 5)).equals(position.nextPosition(Direction.E)));
        assertEquals(true, (new Position(3, 4)).equals(position.nextPosition(Direction.S)));
        assertEquals(true, (new Position(2, 5)).equals(position.nextPosition(Direction.W)));
    }
}
