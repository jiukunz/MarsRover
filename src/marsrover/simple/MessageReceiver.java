package marsrover.simple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MessageReceiver {

    public ArrayList<String> readMessagesFromFile(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader reader = new BufferedReader(fileReader);

        ArrayList<String> messageList = new ArrayList<String>();
        String message;
        while ((message = reader.readLine()) != null) {
            messageList.add(message);
        }

        reader.close();
        fileReader.close();
        return messageList;
    }

}
