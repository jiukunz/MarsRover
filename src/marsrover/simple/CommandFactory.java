package marsrover.simple;


import java.util.HashMap;

public class CommandFactory {
    private HashMap<Character, Command> commandHashMap = new HashMap<Character, Command>();
    //ToDo:Constructor has much more responsibility
    public CommandFactory(MarsRover marsRover) {
        commandHashMap.put('L', new TurnLeftCommand(marsRover));
        commandHashMap.put('R', new TurnRightCommand(marsRover));
        commandHashMap.put('M', new GoCommand(marsRover));
    }

    public Command createCommand(Character command) {
        return commandHashMap.get(command);
    }
}
