package marsrover.simple;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarsSimulatorTest {
    @Test
    public void should_build_the_environment_of_mars() throws Exception {
        MessageReceiver messageReceiver = new MessageReceiver();
        MarsSimulator marsSimulator = new MarsSimulator();
        marsSimulator.createScene(messageReceiver.readMessagesFromFile("./cmd.txt"));

        assertThat(marsSimulator.getPlateauLength(),is(5));
        assertThat(marsSimulator.getPlateauWidth(),is(5));
    }
}
