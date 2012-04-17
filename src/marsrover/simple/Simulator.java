package marsrover.simple;

import java.util.ArrayList;
import java.util.List;

public class Simulator {
    private MarsRoverFactory marsRoverFactory = new MarsRoverFactory();
    private List<String> reportList = new ArrayList<String>();

    public void report() {
        for (String message : reportList){
            System.out.println(message);
        }
    }

    public List<String> process(List<String> inputMessageList) {
        for (int i = 1; i < inputMessageList.size(); i += 2) {
            reportList.add(simulate(inputMessageList.get(i), inputMessageList.get(i + 1)));
        }

        return reportList;
    }

    private String simulate(String initMessage, String commandListMessage) {
        MarsRover marsRover = marsRoverFactory.create(initMessage);
        ArrayList<Command> commandList = createCommandList(commandListMessage, marsRover);

        invokeCommandList(commandList);

        return marsRover.status();
    }

    private void invokeCommandList(ArrayList<Command> commandList) {
        Invoker invoker = new Invoker();

        invoker.setCommandList(commandList);
        invoker.execute();
    }

    private ArrayList<Command> createCommandList(String commandListMessage, MarsRover receiver) {
        CommandFactory commandFactory = new CommandFactory(receiver);

        return this.createCommandList(commandListMessage, commandFactory);
    }

    private ArrayList<Command> createCommandList(String commandListMessage, CommandFactory commandFactory) {
        ArrayList<Command> commandList = new ArrayList<Command>();
        for (Character commandText : commandListMessage.toCharArray()) {
            Command command = commandFactory.createCommand(commandText);
            commandList.add(command);
        }
        return commandList;
    }
}
