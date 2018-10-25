package lws.training.a14;

import java.util.Scanner;

public class UserConverterMenu {

    public static NumberType istype;
    public static NumberType totype;
    public static boolean continu = true;

    public static void getUserInfos() {
        System.out.println("Ist deine ursprüngliche Zahl eine Binärzahl (bin), eine Hexadezimalzahl (hex) oder eine Dezimalzahl (dez)?");
        Scanner scanner = new Scanner(System.in);
        String userChoose = scanner.nextLine();
        if(userChoose.equalsIgnoreCase("bin")) {
            istype = NumberType.isBinary;
        } else if(userChoose.equalsIgnoreCase("hex")) {
            istype = NumberType.isHex;
        } else if(userChoose.equalsIgnoreCase("dez")) {
            istype = NumberType.isDezimal;
        } else {
            System.out.println("Diese Zahlenform existiert nicht/ist nicht verfügbar!");
            continu = false;
        }
        if(continu) {
            System.out.println("Soll die ursprüngliche Zahl zu einer Binärzahl (bin), einer Hexadezimalzahl (hex) oder einer Dezimalzahl (dez) umgewandelt werden?");
            scanner = new Scanner(System.in);
            userChoose = scanner.nextLine();
            if(userChoose.equalsIgnoreCase("bin")) {
                totype = NumberType.toBinary;
            } else if(userChoose.equalsIgnoreCase("hex")) {
                totype = NumberType.toHex;
            } else if(userChoose.equalsIgnoreCase("dez")) {
                totype = NumberType.toDezimal;
            } else {
                System.out.println("Diese Zahlenform existiert nicht/ist nicht verfügbar!");
                continu = false;
            }
            System.out.println("Bitte gebe sie ihre Zahl an: ");
            scanner = new Scanner(System.in);
            String number = scanner.nextLine();
            String convertetNumber = "0";
            if(continu) {
                if(istype == NumberType.isDezimal) {
                    if(totype == NumberType.toBinary) {
                        convertetNumber = NumberConverter.dezimaltobinary(number);
                    } else if(totype == NumberType.toDezimal) {
                        convertetNumber = "" + number;
                    } else if(totype == NumberType.toHex) {
                        convertetNumber = NumberConverter.dezimaltohex(number);
                    } else {
                        convertetNumber = "" + number;
                    }
                } else if(istype == NumberType.isHex) {
                    if(totype == NumberType.toBinary) {
                        convertetNumber = NumberConverter.hextodezimal(number);
                        convertetNumber = NumberConverter.dezimaltobinary(convertetNumber);
                    } else if(totype == NumberType.toDezimal) {
                        convertetNumber = NumberConverter.hextodezimal(number);
                    } else if(totype == NumberType.toHex) {
                        convertetNumber = "" + number;
                    } else {
                        convertetNumber = "" + number;
                    }
                } else if(istype == NumberType.isBinary) {
                    if(totype == NumberType.toBinary) {
                        convertetNumber = "" + number;
                    } else if(totype == NumberType.toDezimal) {
                        convertetNumber = NumberConverter.binarytodezimal(number);
                    } else if(totype == NumberType.toHex) {
                        convertetNumber = NumberConverter.hextodezimal(number);
                        convertetNumber = NumberConverter.dezimaltohex(convertetNumber);
                    } else {
                        convertetNumber = "" + number;
                    }
                } else {
                   convertetNumber = "" + number;
                }
                String formatetnumber = "";
                if (totype == NumberType.toHex || totype == NumberType.toBinary) {
                    for(int i = convertetNumber.length() - 1; i >= 0; i--) {
                        char part = convertetNumber.charAt(i);
                        formatetnumber = formatetnumber + part;
                    }
                } else {
                    formatetnumber = convertetNumber;
                }
                System.out.println("Deine konvertierte Zahl: " + formatetnumber);
            }
        }
    }
}
