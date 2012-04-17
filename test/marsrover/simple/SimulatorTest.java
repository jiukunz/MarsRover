package marsrover.simple;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SimulatorTest {
    @Test
    public void should_return_output_when_give_input_file_path() throws IOException {
        List<String> inputMessageList = new ArrayList<String>();
        inputMessageList.add("5 5");
        inputMessageList.add("1 2 N");
        inputMessageList.add("LMLMLMLMM");
        Simulator simulator = new Simulator();
        
        List<String> outputMessageList = simulator.process(inputMessageList);

        assertEquals(outputMessageList.get(0),"1 3 N");
    }
}
