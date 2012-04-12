package marsrover.simple;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UtilTest {
    @Test
    public void split_string_with_blank() {
        String[] stringSplited = Util.splitStringWithBlank("5 6 N");

        assertEquals("5",stringSplited[0]);
        assertEquals("6",stringSplited[1]);
        assertEquals("N",stringSplited[2]);
    }

    @Test
    public void should_return_file_message_list_when_receive_a_file_path() {
        String filePath = "cmd.txt";

        ArrayList<String> messageList = Util.readMessagesFromFile(filePath);

        assertEquals(messageList.get(0),"5 5");
        assertEquals(messageList.get(2),"LMLMLMLMM");
        assertEquals(messageList.get(6),"MRLMRLMRL");
    }
}
