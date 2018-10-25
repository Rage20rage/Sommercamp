package lws.training.a3;

import java.util.Scanner;

public class Message {

    public static String get() {
        System.out.print("Bitte gebe eine Nachricht zwischen 1 und 20 Zeichen ein: ");
        Scanner sc = new Scanner(System.in);
        return(sc.nextLine());
    }

}
