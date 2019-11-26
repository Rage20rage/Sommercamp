package lws.training.aown1;

import lws.training.start.Time;

import java.io.FileWriter;
import java.io.IOException;

public class MsgLog {

    protected static String defaultLogFile = "Table.txt";
    private static FileWriter aWriter;
    private static boolean start = true;
    private static int current = 0;

    public static void write(String s, boolean end) throws IOException {
        write(defaultLogFile, s, end);
    }

    private static void write(String f, String s, boolean end) throws IOException {
        if(start) {
            aWriter = new FileWriter(f, true);
            start = false;
        }
        aWriter.write(s + "\n");
        if(current==5 || end) {
            aWriter.flush();
            current=0;
        }
        if(end) {
            aWriter.close();
        }
        current++;
    }

}
