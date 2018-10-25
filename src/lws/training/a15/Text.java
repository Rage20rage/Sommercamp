package lws.training.a15;

import java.util.Scanner;

public class Text {

    public static boolean checkText(String text) {
        String swapedtext = "";
        for(int i = text.length() - 1; i >= 0; i--) {
            char part = text.charAt(i);
            swapedtext = swapedtext + part;
        }
        if(swapedtext.equalsIgnoreCase(text)) {
            return  true;
        } else {
            return false;
        }
    }

    public static void getUserText() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gebe das zu testende Wort ein: ");
        String word = scanner.nextLine();
        if(checkText(word)) {
            System.out.println("Das eigegebene Wort ist ein Palindrome!");
        } else {
            System.out.println("Das eigegebene Wort ist kein ein Palindrome!");
        }
    }

}
