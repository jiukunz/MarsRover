package marsrover.simple;

import org.junit.Test;

import java.io.*;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class UtilTest {
    @Test
    public void split_string_with_blank() {
        String[] stringSplited = Util.splitStringWithBlank("5 6 N");

        assertEquals("5",stringSplited[0]);
        assertEquals("6",stringSplited[1]);
        assertEquals("N",stringSplited[2]);
    }

    @Test
    public void should_return_file_message_list_when_receive_a_reader() throws Exception {
        String content = new String("ooo\r\nxxx\r\n");
        Reader reader = new StringReader(content);

        List<String> messageList = Util.readMessagesFromReader(reader);

        assertEquals(messageList.get(0),"ooo");
        assertEquals(messageList.get(1),"xxx");
    }
}
