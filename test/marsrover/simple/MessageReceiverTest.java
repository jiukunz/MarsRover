package marsrover.simple;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MessageReceiverTest {
    @Test
    public void should_parse_to_config_object_when_read_message_from_file() throws IOException {
        MessageReceiver messageReceiver = new MessageReceiver();
        ArrayList<String> messages = messageReceiver.readMessagesFromFile("./cmd.txt");

        assertThat(messages.get(0),is("5 5"));
        assertThat(messages.get(4),is("MMRMMRMRRM"));
    }
}
