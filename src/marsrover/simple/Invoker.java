package marsrover.simple;

import java.util.ArrayList;

public class Invoker {
    private ArrayList<Command> commandList;

    public void setCommandList(ArrayList<Command> commandList) {
        this.commandList = commandList;
    }


    public void execute() {
        for (Command command : commandList) {
            command.execute();
        }
    }
}
