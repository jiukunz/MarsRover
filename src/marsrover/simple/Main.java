package marsrover.simple;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "cmd.txt";
        List<String> inputMessageList = parseFile(filePath);

        Simulator simulator = new Simulator();
        simulator.process(inputMessageList);
        simulator.report();
    }

    private static List<String> parseFile(String filePath) {
        Reader reader = null;
        try {
            reader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("File does not found.System exit.");
            System.exit(-1);
        }
        return Util.readMessagesFromReader(reader);
    }
}
