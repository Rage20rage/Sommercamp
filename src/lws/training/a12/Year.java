package lws.training.a12;

import java.util.Scanner;

public class Year {

    public static boolean isleapyear(int year) {
        boolean isleapyear = false;
        if(year%4 == 0) {
            isleapyear = true;
        }
        return isleapyear;
    }

    public static void askforyear() {
        System.out.print("Gebe sie das gewünschte Jahr zum testen an: ");
        Scanner scanner = new Scanner(System.in);
        if(isleapyear(scanner.nextInt())) {
             System.out.println("Das  Jahr ist ein Schaltjahr!");
        } else {
            System.out.println("Das Jahr ist kein Schaltjahr!");
        }
    }

}
