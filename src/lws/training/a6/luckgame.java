package lws.training.a6;

import java.util.Random;

public class luckgame {

    public static void calculateluck() {
        Random r = new Random();
        int randomnumber = 1 + r.nextInt(50);
        System.out.println("Deine Zufallszahl: " + randomnumber);
        if(randomnumber <= 21) {
            System.out.println("Gewonnen!");
        } else {
            System.out.println("Verloren!");
        }
    }

}
