package marsrover.simple;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SimulatorTest {
    @Test
    public void should_return_output_when_give_input_file_path() {
        Simulator simulator = new Simulator();
        
        String output = simulator.shuRuDaoShuChu("cmd.txt");

        assertThat(output,is("1 3 N\n" + "5 1 E\n" + "2 3 W\n"));
    }
}
