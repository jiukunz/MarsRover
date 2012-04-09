package marsrover.simple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Simulator {
    public void run() throws IOException {
        FileReader fr = new FileReader("./cmd.txt");
        BufferedReader reader = new BufferedReader(fr);
        String commands = reader.readLine();
        while ((commands = reader.readLine()) != null) {
            MarsRover marsRover = initMarsRoverWithCommand(commands);
            commands = reader.readLine();
            letMarsRoverExecuteCommand(commands, marsRover);
            displayMarsRoverStatus(marsRover);
        }
        reader.close();
    }

    private void displayMarsRoverStatus(MarsRover marsRover) {
        System.out.println(
                marsRover.getCurPosition().getxCoord() +
                        " " + marsRover.getCurPosition().getyCoord() +
                        " " + marsRover.getCurDirection()
        );
    }

    private void letMarsRoverExecuteCommand(String commands, MarsRover marsRover) {
        CommandFactory commandFactory = new CommandFactory(marsRover);
        commandFactory.initial();
        for (char c : commands.toCharArray()) {
            Command command = commandFactory.createCommand(c);
            marsRover.executeCommand(command);
        }
    }

    private MarsRover initMarsRoverWithCommand(String commands) {
        String[] marsRoverInitInfo = Util.splitStringWithBlank(commands);
        Position position = new Position(Integer.parseInt(marsRoverInitInfo[0]), Integer.parseInt(marsRoverInitInfo[1]));
        Direction direction = Direction.valueOf(marsRoverInitInfo[2]);
        return new MarsRover(position, direction);
    }
}