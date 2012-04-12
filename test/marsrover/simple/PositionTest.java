package marsrover.simple;

import marsrover.simple.Direction;
import marsrover.simple.Position;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PositionTest {
    @Test
    public void should_be_next_position_of_exact_direction() {
        Position position = new Position(3, 5);

        assertEquals(position.nextPosition(Direction.N).getyCoord(),6);
        assertEquals(position.nextPosition(Direction.S).getyCoord(),4);
        assertEquals(position.nextPosition(Direction.E).getxCoord(),4);
        assertEquals(position.nextPosition(Direction.W).getxCoord(),2);
    }
}
