package lws.training.a17;

import java.util.Scanner;

public class RunA17 {

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        boolean continu = true;
        while (continu) {
            System.out.print("Möchtest du verschlüsseln (v) oder entschlüsseln (e): ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("v")) {
                continu = false;
                System.out.println("Bitte gebe deine Nachricht ein:");
                String tmp = scanner.nextLine();
                System.out.println("Verschlüsselt: (Non-Unicode)" + CäsarChiffre.encrypt(tmp));
                System.out.println("Verschlüsselt: (Unicode)" + CäsarChiffreUnicode.encrypt(tmp));
            } else if (userInput.equalsIgnoreCase("e")) {
                continu = false;
                System.out.println("Bitte gebe deine Nachricht ein:");
                String tmp = scanner.nextLine();
                System.out.println("Entschlüsselt: (Non-Unicode)" + CäsarChiffre.decrypt(tmp));
                System.out.println("Entschlüsselt: (Unicode)" + CäsarChiffreUnicode.decrypt(tmp));
            }
        }
    }

}
