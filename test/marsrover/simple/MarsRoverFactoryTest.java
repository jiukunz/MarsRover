package marsrover.simple;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarsRoverFactoryTest {
    @Test
    public void should_return_marsrover_with_init_message() {
        String initMessage = "5 5 N";
        MarsRoverFactory marsRoverFactory = new MarsRoverFactory();
        MarsRover marsRover = marsRoverFactory.createMarsRover(initMessage);

        assertThat(marsRover.status(),is("5 5 N"));
    }
}
