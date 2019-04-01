package lws.training.a9;

public class RunA9 {

    public static void start() {
        int usermaxnumber = PrimeNumber.getUserMaxNumber();
        int count = 1;
        for (int i = 0; i <= usermaxnumber; i++) {
            if(PrimeNumber.isPrimeNumber(i)) {
                System.out.println("Primzahl Nummer " + count +": " + i);
                count++;
            }
        }
    }

}
