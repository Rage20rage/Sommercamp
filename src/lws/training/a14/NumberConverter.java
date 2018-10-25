package lws.training.a14;

public class NumberConverter {

    public static String  dezimaltobinary(String number) {
        int numb = Integer.valueOf(number);
        String binary = "";
        while (numb != 0) {
            binary = binary + (numb%2);
            numb = numb/2;
        }
        return binary;
    }

    public static String binarytodezimal(String binary) {
        String dezimal = String.valueOf(Integer.parseInt(binary, 2));
        return dezimal;
    }

    public static String dezimaltohex(String number) {
        int numb = Integer.valueOf(number);
        String hex = "";
        while (numb != 0) {
            if(numb % 16  > 9) {
                if(numb % 16 == 10) {
                    hex = hex + "A";
                }
                if(numb % 16 == 11) {
                    hex = hex + "B";
                }
                if(numb % 16 == 12) {
                    hex = hex + "C";
                }
                if(numb % 16 == 13) {
                    hex = hex + "D";
                }
                if(numb % 16 == 14) {
                    hex = hex + "E";
                }
                if(numb % 16 == 15) {
                    hex = hex + "F";
                }
            } else {
                hex = hex + numb;
            }
            numb = numb/16;
        }
        return hex;
    }

    public static String hextodezimal(String hex) {
        boolean continu = true;
        String dezimal = "";
        int deznumb = 0;
        int hexlength = hex.length() - 1;
        for(int i = 0; i < hex.length() && continu; i++) {
            char part = hex.charAt(i);
            int hnumb = 0;
            switch (part){
                case '1' : hnumb = 1; break;
                case '2' : hnumb = 2; break;
                case '3' : hnumb = 3; break;
                case '4' : hnumb = 4; break;
                case '5' : hnumb = 5; break;
                case '6' : hnumb = 6; break;
                case '7' : hnumb = 7; break;
                case '8' : hnumb = 8; break;
                case '9' : hnumb = 9; break;
                case 'A' : hnumb = 10; break;
                case 'B' : hnumb = 11; break;
                case 'C' : hnumb = 12; break;
                case 'D' : hnumb = 13; break;
                case 'E' : hnumb = 14; break;
                case 'F' : hnumb = 15; break;
                default : continu = false;
            }
            if(continu) {
                deznumb = (int) (deznumb + hnumb * (Math.pow(16, (hexlength))));
                hexlength--;
            } else {
                System.out.println("Die eingegebendeZahl ist keine Hexadezimalzahl!");
                break;
            }
        }
        dezimal = "" + deznumb;
        return dezimal;
    }

}
