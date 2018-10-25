package lws.training.a19;

import java.util.ArrayList;
import java.util.Scanner;

public class BrainfuckInterpreter {

    private static final int LENGTH = 65535;
    public static byte[] list = new byte[LENGTH];
    private static int pointer = 0;
    private static Scanner scanner = new Scanner(System.in);
    private static int x = 0;

    public static void toText(String code) {
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            switch (c) {
                case '+':
                    list[pointer]++;
                    break;
                case '-':
                    list[pointer]--;
                    break;
                case '>':
                    pointer++;
                    break;
                case '<':
                    pointer--;
                    break;
                case '.':
                    System.out.print((char) list[pointer]);
                    break;
                case ',':
                    list[pointer] = (byte) scanner.next().charAt(0);
                    break;
                case '[':
                    if (list[pointer] == 0) {
                        x++;
                        while (x > 0) {
                            i++;
                            if (code.charAt(i) == '[') {
                                x++;
                            }
                            if (code.charAt(i) == ']') {
                                x--;
                            }
                        }
                    }
                    break;
                case ']':
                    if (list[pointer] != 0) {
                        x++;
                        while (x > 0) {
                            i--;
                            if (code.charAt(i) == '[') {
                                x--;
                            }
                            if (code.charAt(i) == ']') {
                                x++;
                            }
                        }
                    }
                    break;
                }
           }
    }
}