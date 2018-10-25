package lws.training.a9;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrimeNumber(int number) {
        boolean isPrimeNumber = true;
        int divider = 2;
        while (divider <= number/2 && isPrimeNumber) {
            if (number%divider == 0) {
                isPrimeNumber = false;
            } else {
                divider++;
            }
        }
        return isPrimeNumber;
    }

    public static Integer getUserMaxNumber() {
        System.out.print("Bitte gebe deine Zahl ein bis zu welcher die Primzahlen getestet werden sollen: ");
        Scanner scanner = new Scanner(System.in);
        String usermaxnumber = scanner.nextLine();
        if(usermaxnumber.equalsIgnoreCase("max")) {
            return Integer.MAX_VALUE;
        } else {
            return Integer.valueOf(usermaxnumber);
        }
    }

}
