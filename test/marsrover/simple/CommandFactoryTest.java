package marsrover.simple;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CommandFactoryTest {
    @Test
    public void should_return_special_command_object_after_receive_character() {

        MarsRover marsRover = new MarsRover(new Position(3,5),Direction.N);
        CommandFactory commandFactory = new CommandFactory(marsRover);

        char left = 'L';
        char right = 'R';
        char goAhead = 'M';

        assertEquals(true,commandFactory.createCommand(left) instanceof TurnLeftCommand);
        assertEquals(true,commandFactory.createCommand(right) instanceof TurnRightCommand);
        assertEquals(true,commandFactory.createCommand(goAhead) instanceof GoCommand);
    }
}
