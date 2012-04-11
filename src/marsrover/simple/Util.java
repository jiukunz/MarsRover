package marsrover.simple;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Util {
    public static String[] splitStringWithBlank(String command) {
        return command.split("\\s");
    }

    //ToDo:Method is too long
    public static ArrayList<String> readMessagesFromFile(String filePath) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Input file is not found.");
            System.exit(-1);
        }
        BufferedReader reader = new BufferedReader(fileReader);

        ArrayList<String> messageList = new ArrayList<String>();
        String message;
        try {
            while ((message = reader.readLine()) != null) {
                messageList.add(message);
            }
            reader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return messageList;
    }
}
