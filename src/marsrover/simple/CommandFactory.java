package marsrover.simple;

import com.sun.tools.javac.util.Pair;

import java.util.HashMap;

public class CommandFactory {

    private MarsRover marsRover;

    public CommandFactory(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    private HashMap<Character,Command> commandHashMap = new HashMap<Character, Command>();

    public void initial(){
        commandHashMap.put('L',new TurnLeftCommand(marsRover));
        commandHashMap.put('R',new TurnRightCommand(marsRover));
        commandHashMap.put('M',new GoAheadCommand(marsRover));
    }
    public Command createCommand(Character command){
        return commandHashMap.get(command);
    }
}
