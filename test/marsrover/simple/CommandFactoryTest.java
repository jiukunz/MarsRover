package marsrover.simple;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CommandFactoryTest {

    private MarsRover marsRover;
    private CommandFactory commandFactory;

    @Before
    public void setUp() throws Exception {
        marsRover = new MarsRover(new Position(3,5), Direction.N);
        commandFactory = new CommandFactory(marsRover);
    }

    @Test
    public void should_return_turn_left_command_when_receive_character_L() throws Exception {
        char left = 'L';

        assertEquals(true, commandFactory.createCommand(left) instanceof TurnLeftCommand);
    }

    @Test
    public void should_return_turn_right_command_when_receive_character_R() throws Exception {
        char right = 'R';

        assertEquals(true, commandFactory.createCommand(right) instanceof TurnRightCommand);
    }

    @Test
    public void should_return_go_command_when_receive_character_M() throws Exception {
        char goAhead = 'M';

        assertEquals(true, commandFactory.createCommand(goAhead) instanceof GoCommand);
    }
}
