package lws.training.a19;

import java.util.Scanner;

public class RunA19 {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie ihren Code ein:");
        String tmp = scanner.nextLine();
        System.out.println();
        System.out.println("----------Convertierter-Text----------");
        System.out.println();
        BrainfuckInterpreter.toText(tmp);
    }
}
