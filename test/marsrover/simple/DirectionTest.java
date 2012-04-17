package marsrover.simple;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectionTest {

    @Test
    public void should_get_left_direction() {
        assertEquals(Direction.W.left(), Direction.S);
        assertEquals(Direction.S.left(), Direction.E);
        assertEquals(Direction.E.left(), Direction.N);
        assertEquals(Direction.N.left(), Direction.W);
    }

    @Test
    public void should_get_right_direction() {
        assertEquals(Direction.W.right(), Direction.N);
        assertEquals(Direction.S.right(), Direction.W);
        assertEquals(Direction.E.right(), Direction.S);
        assertEquals(Direction.N.right(), Direction.E);
    }

}
