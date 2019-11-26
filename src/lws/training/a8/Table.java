package lws.training.a8;

import lws.training.aown1.MsgLog;
import lws.training.start.Time;

import java.io.IOException;
import java.util.Scanner;

public class Table {

    private static long size;

    public static void setSize() {
        System.out.print("Bitte gebe eine Zahl als größe für die Tabelle an: ");
        Scanner sc = new Scanner(System.in);
        String nbr = sc.nextLine();
        if(nbr.equalsIgnoreCase("max")) {
            size = Long.valueOf("3037000499");
        } else if(nbr.equalsIgnoreCase("min")) {
            size = Long.valueOf("-3037000499");
        } else {
            size = Long.valueOf(nbr);
        }
    }

    public static void genereate() {
            for(long i = 1; i <= size; i++) {
                for(long x = 1; x <= size; x++) {
                    long sum = x*i;
                    String block = sum + Spacer(sum);
                    System.out.print(block);
                    try {
                        MsgLog.write(block, false);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("\n");
                try {
                    MsgLog.write("\n", false);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        try {
            MsgLog.write("", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String Spacer(long number) {
        String spacer = " ";
        long textsize = ((String.valueOf(size)).length() - (String.valueOf(number)).length());
        for(long i = textsize; i >= 0; i--) {
            spacer = spacer + " ";
        }
        return spacer;
    }

}
