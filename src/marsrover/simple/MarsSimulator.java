package marsrover.simple;

import java.util.ArrayList;
import java.util.HashMap;

public class MarsSimulator {
    private int plateauLength;
    private int plateauWidth;
    private HashMap<MarsRover,ArrayList<Command>> marsRoversContext = new HashMap<MarsRover, ArrayList<Command>>();

    public boolean update(ArrayList<String> messageList) {
        String[] plateauSize = Util.splitStringWithBlank(messageList.get(0));
        this.plateauLength = Integer.parseInt(plateauSize[0]);
        this.plateauWidth = Integer.parseInt(plateauSize[1]);

        MarsRoverFactory marsRoverFactory = new MarsRoverFactory();

        for (int i = 1;i < messageList.size();i+=2){
            MarsRover marsRover = marsRoverFactory.createMarsRover(messageList.get(i));
            CommandFactory commandFactory = new CommandFactory(marsRover);
            commandFactory.initial();
            
            String commandsText = messageList.get(i+1);
            ArrayList<Command> commandList = new ArrayList<Command>();
            for(Character commandText : commandsText.toCharArray()){
                Command command = commandFactory.createCommand(commandText);
                commandList.add(command);
            }
            marsRoversContext.put(marsRover,commandList);
        }
        return true;
    }

    public int getPlateauLength() {
        return plateauLength;
    }

    public int getPlateauWidth() {
        return plateauWidth;
    }
}
