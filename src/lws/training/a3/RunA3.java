package lws.training.a3;

import java.util.ArrayList;

public class RunA3 {

    public static void start() {
        String message = "";
        message = Message.get();
        if(message.length() >= 21 || message.length() <= 0) {
            System.out.println("Bitte gebe eine Nachricht zwischen 1-20 Zeichen an!");
            start();
        } else {
            Cowsay.draw(message);
        }
    }

}
