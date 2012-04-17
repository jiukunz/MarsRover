package marsrover.simple;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Util {
    public static String[] splitStringWithBlank(String string) {
        return string.split("\\s");
    }

    public static List<String> readMessagesFromReader(Reader reader) {
        String message = readFileToString(reader);
        String[] strings = splitStringWithLine(message);

        List<String> arrayList = Arrays.asList(strings);

        return arrayList;
    }

    private static String readFileToString(Reader reader) {
        char[] buffer = new char[256];
        try {
            reader.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        return String.valueOf(buffer).trim();
    }

    private static String[] splitStringWithLine(String string) {
        return string.split("\\r\\n");
    }
}
