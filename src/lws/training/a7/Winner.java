package lws.training.a7;

import java.util.HashMap;
import java.util.Random;

public class Winner {

    public static void calculate() {
        Random r = new Random();
        int randomnumber = r.nextInt(100);
        HashMap<Player, Integer> map = PlayerNumbers.get();
        System.out.println("");
        int player1 = Math.abs(map.get(Player.PLAYER1) - randomnumber);
        int player2 = Math.abs(map.get(Player.PLAYER2) - randomnumber);
        if(player1 == player2) {
            System.out.println("Unentschieden!");
        } else if(player1 < player2) {
            System.out.println("Spieler 1 hat gewonnen!");
        } else {
            System.out.println("Spieler 2 hat gewonnen!");
        }
        System.out.println("Zufallszahl: " + randomnumber);
    }

}
