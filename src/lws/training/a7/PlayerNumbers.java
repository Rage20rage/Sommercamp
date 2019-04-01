package lws.training.a7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PlayerNumbers {

    public static HashMap<Player, Integer> get() {
        HashMap<Player, Integer> map = new HashMap<>();
        System.out.print("Spieler 1 gibt seinen Tipp ab: ");
        Scanner sc = new Scanner(System.in);
        map.put(Player.PLAYER1, sc.nextInt());

        System.out.print("Spieler 2 gibt seinen Tipp ab: ");
        sc = new Scanner(System.in);
        map.put(Player.PLAYER2, sc.nextInt());
        return map;
    }

}
