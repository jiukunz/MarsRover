package marsrover.simple;

import java.util.ArrayList;

public class Simulator {
    private MarsRoverFactory marsRoverFactory = new MarsRoverFactory();

    public String shuRuDaoShuChu(String filePath) {
        StringBuilder output = new StringBuilder();
        ArrayList<String> messageList = Util.readMessagesFromFile(filePath);
        for (int i = 1; i < messageList.size(); i += 2) {
            output.append(simulate(messageList.get(i), messageList.get(i + 1)));
            output.append("\n");
        }
        return output.toString();
    }

    private String simulate(String initMessage, String commandListMessage) {
        MarsRover marsRover = this.marsRoverFactory.createMarsRover(initMessage);
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
        return createCommandList(commandListMessage, commandFactory);
    }

    public static ArrayList<Command> createCommandList(String commandListMessage, CommandFactory commandFactory) {

        ArrayList<Command> commandList = new ArrayList<Command>();
        for (Character commandText : commandListMessage.toCharArray()) {
            Command command = commandFactory.createCommand(commandText);
            commandList.add(command);
        }
        return commandList;
    }
}
