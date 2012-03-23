package marsrover.simple;

import marsrover.simple.Direction;
import marsrover.simple.MarsRover;
import marsrover.simple.Position;
import org.junit.Before;
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

    @Test
    public void should_be_cliff_in_front_of_marsrover(){
        Plateau plateau = new Plateau(5,6);
        MarsRover marsRover = new MarsRover(new Position(0,2),Direction.W);
        marsRover.jumpToPlateau(plateau);
        marsRover.goAhead();

        MarsRover marsRover1 = new MarsRover(new Position(2,5),Direction.N);
        marsRover1.jumpToPlateau(plateau);
        marsRover1.goAhead();

        MarsRover marsRover2 = new MarsRover(new Position(4,2),Direction.E);
        marsRover2.jumpToPlateau(plateau);
        marsRover2.goAhead();

        MarsRover marsRover3 = new MarsRover(new Position(2,0),Direction.S);
        marsRover3.jumpToPlateau(plateau);
        marsRover3.goAhead();


    }
}
