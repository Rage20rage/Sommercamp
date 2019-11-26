package lws.training.a17;

public class CäsarChiffreUnicode {

    public static String encrypt(String message) {
        String  crpyt = "";
        for (int i = 0; i < message.length(); i++) {
            int tmp = message.charAt(i);
            tmp+=34;
            if(tmp > 126) {
                tmp-=86;
            }
            if(tmp < 40) {
                tmp+=86;
            }
            crpyt = crpyt + (char) tmp;
        }
        return crpyt;
    }

    public static String  decrypt(String message) {
        String  crpyt = "";
        for (int i = 0; i < message.length(); i++) {
            int tmp = message.charAt(i);
            tmp-=34;
            if(tmp > 126) {
                tmp-=86;
            }
            if(tmp < 40) {
                tmp+=86;
            }
            crpyt = crpyt + (char) tmp;
        }
        return crpyt;
    }

}
