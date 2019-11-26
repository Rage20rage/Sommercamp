package lws.training.a17;

public class CäsarChiffre {

    public static String encrypt(String message) {
        int diff = 4;
        message.toLowerCase();
        String crypt = "";
        for (int i = 0; i < message.length(); i++) {
            char tmp = message.charAt(i);
            int x = 0;
            switch (tmp) {
                case 'a' : x = 1; break;
                case 'b' : x = 2; break;
                case 'c' : x = 3; break;
                case 'd' : x = 4; break;
                case 'e' : x = 5; break;
                case 'f' : x = 6; break;
                case 'g' : x = 7; break;
                case 'h' : x = 8; break;
                case 'i' : x = 9; break;
                case 'j' : x = 10; break;
                case 'k' : x = 11; break;
                case 'l' : x = 12; break;
                case 'm' : x = 13; break;
                case 'n' : x = 14; break;
                case 'o' : x = 15; break;
                case 'p' : x = 16; break;
                case 'q' : x = 17; break;
                case 'r' : x = 18; break;
                case 's' : x = 19; break;
                case 't' : x = 20; break;
                case 'u' : x = 21; break;
                case 'v' : x = 22; break;
                case 'w' : x = 23; break;
                case 'x' : x = 24; break;
                case 'y' : x = 25; break;
                case 'z' : x = 26; break;
                case 'ß' : x = 27; break;
                case ' ' : x = 28; break;
                case 'ä' : x = 29; break;
                case 'ü' : x = 30; break;
                case 'ö' : x = 31; break;
            }
            x+=diff;
            if(x > 31) {
                x-=31;
            }
            switch (x) {
                case 1 : crypt = crypt + 'a'; break;
                case 2 : crypt = crypt + 'b'; break;
                case 3 : crypt = crypt + 'c'; break;
                case 4 : crypt = crypt + 'd'; break;
                case 5 : crypt = crypt + 'e'; break;
                case 6 : crypt = crypt + 'f'; break;
                case 7 : crypt = crypt + 'g'; break;
                case 8 : crypt = crypt + 'h'; break;
                case 9 : crypt = crypt + 'i'; break;
                case 10 : crypt = crypt + 'j'; break;
                case 11 : crypt = crypt + 'k'; break;
                case 12 : crypt = crypt + 'l'; break;
                case 13 : crypt = crypt + 'm'; break;
                case 14 : crypt = crypt + 'n'; break;
                case 15 : crypt = crypt + 'o'; break;
                case 16 : crypt = crypt + 'p'; break;
                case 17 : crypt = crypt + 'q'; break;
                case 18 : crypt = crypt + 'r'; break;
                case 19 : crypt = crypt + 's'; break;
                case 20 : crypt = crypt + 't'; break;
                case 21 : crypt = crypt + 'u'; break;
                case 22 : crypt = crypt + 'v'; break;
                case 23 : crypt = crypt + 'w'; break;
                case 24 : crypt = crypt + 'x'; break;
                case 25 : crypt = crypt + 'y'; break;
                case 26 : crypt = crypt + 'z'; break;
                case 27 : crypt = crypt + 'ß'; break;
                case 28 : crypt = crypt + ' '; break;
                case 29 : crypt = crypt + 'ä'; break;
                case 30 : crypt = crypt + 'ü'; break;
                case 31 : crypt = crypt + 'ö'; break;
            }
        }
        return crypt;
    }

    public static String  decrypt(String message) {
        int diff = 4;
        message.toLowerCase();
        String crypt = "";
        for (int i = 0; i < message.length(); i++) {
            char tmp = message.charAt(i);
            int x = 0;
            switch (tmp) {
                case 'a' : x = 1; break;
                case 'b' : x = 2; break;
                case 'c' : x = 3; break;
                case 'd' : x = 4; break;
                case 'e' : x = 5; break;
                case 'f' : x = 6; break;
                case 'g' : x = 7; break;
                case 'h' : x = 8; break;
                case 'i' : x = 9; break;
                case 'j' : x = 10; break;
                case 'k' : x = 11; break;
                case 'l' : x = 12; break;
                case 'm' : x = 13; break;
                case 'n' : x = 14; break;
                case 'o' : x = 15; break;
                case 'p' : x = 16; break;
                case 'q' : x = 17; break;
                case 'r' : x = 18; break;
                case 's' : x = 19; break;
                case 't' : x = 20; break;
                case 'u' : x = 21; break;
                case 'v' : x = 22; break;
                case 'w' : x = 23; break;
                case 'x' : x = 24; break;
                case 'y' : x = 25; break;
                case 'z' : x = 26; break;
                case 'ß' : x = 27; break;
                case ' ' : x = 28; break;
                case 'ä' : x = 29; break;
                case 'ü' : x = 30; break;
                case 'ö' : x = 31; break;
            }
            x-=diff;
            if(x < 1) {
                x+=31;
            }
            switch (x) {
                case 1 : crypt = crypt + 'a'; break;
                case 2 : crypt = crypt + 'b'; break;
                case 3 : crypt = crypt + 'c'; break;
                case 4 : crypt = crypt + 'd'; break;
                case 5 : crypt = crypt + 'e'; break;
                case 6 : crypt = crypt + 'f'; break;
                case 7 : crypt = crypt + 'g'; break;
                case 8 : crypt = crypt + 'h'; break;
                case 9 : crypt = crypt + 'i'; break;
                case 10 : crypt = crypt + 'j'; break;
                case 11 : crypt = crypt + 'k'; break;
                case 12 : crypt = crypt + 'l'; break;
                case 13 : crypt = crypt + 'm'; break;
                case 14 : crypt = crypt + 'n'; break;
                case 15 : crypt = crypt + 'o'; break;
                case 16 : crypt = crypt + 'p'; break;
                case 17 : crypt = crypt + 'q'; break;
                case 18 : crypt = crypt + 'r'; break;
                case 19 : crypt = crypt + 's'; break;
                case 20 : crypt = crypt + 't'; break;
                case 21 : crypt = crypt + 'u'; break;
                case 22 : crypt = crypt + 'v'; break;
                case 23 : crypt = crypt + 'w'; break;
                case 24 : crypt = crypt + 'x'; break;
                case 25 : crypt = crypt + 'y'; break;
                case 26 : crypt = crypt + 'z'; break;
                case 27 : crypt = crypt + 'ß'; break;
                case 28 : crypt = crypt + ' '; break;
                case 29 : crypt = crypt + 'ä'; break;
                case 30 : crypt = crypt + 'ü'; break;
                case 31 : crypt = crypt + 'ö'; break;
            }
        }
        return crypt;
    }

}
