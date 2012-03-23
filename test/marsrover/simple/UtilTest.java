package marsrover.simple;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class UtilTest {
    @Test
    public void testSplitStringWithBlank() {
        String[] temp = Util.splitStringWithBlank("5 6 N");
        assertEquals("5",temp[0]);
        assertEquals("6",temp[1]);
        assertEquals("N",temp[2]);
    }
}
