package lws.training.a16;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RunA16 {

    public static void start() {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Wie viele zufällige Zahlen sollen generiert werden (max: 100): ");
        Scanner scanner = new Scanner(System.in);
        boolean wrongNumber = true;
        int userInput = 0;
        while (wrongNumber) {
            userInput = scanner.nextInt();
            if (userInput > 100 || userInput < 1) {
                System.out.println("Deine Zahl ist nicht zwischen 2 und 100!");
            } else {
                wrongNumber = false;
            }
        }
        for (int i = 0; i <= userInput; i++) {
            Random r = new Random();
            int tmp = 1 + r.nextInt(100);
            if(!list.contains(tmp)) {
                list.add(tmp);
            } else {
                i--;
            }
        }
        System.out.println("Ausgangszahlen: " + list.toString());
        System.out.println("Sortiert: " + SelectionSort.sort(list).toString());
    }

}
