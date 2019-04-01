package lws.training.start;

import lws.training.a1.RunA1;
import lws.training.a10.RunA10;
import lws.training.a11.RunA11;
import lws.training.a12.RunA12;
import lws.training.a13.RunA13;
import lws.training.a14.RunA14;
import lws.training.a15.RunA15;
import lws.training.a16.RunA16;
import lws.training.a17.RunA17;
import lws.training.a18.RunA18;
import lws.training.a19.RunA19;
import lws.training.a2.RunA2;
import lws.training.a3.RunA3;
import lws.training.a4.RunA4;
import lws.training.a5.RunA5;
import lws.training.a6.RunA6;
import lws.training.a7.RunA7;
import lws.training.a8.RunA8;
import lws.training.a9.RunA9;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Wähle eine Aufgabe aus: ");
        Scanner sc = new Scanner(System.in);
        int aufgabe = sc.nextInt();
        if (aufgabe == 1) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA1.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else if (aufgabe == 2) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA2.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else if (aufgabe == 3) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA3.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else if (aufgabe == 4) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA4.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else if (aufgabe == 5) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA5.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else if (aufgabe == 6) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA6.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else if (aufgabe == 7) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA7.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else if (aufgabe == 8) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA8.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else if (aufgabe == 9) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA9.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else if (aufgabe == 10) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA10.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else if (aufgabe == 11) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA11.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else if (aufgabe == 12) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA12.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else if (aufgabe == 13) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA13.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else if (aufgabe == 14) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA14.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else if (aufgabe == 15) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA15.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else if (aufgabe == 16) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA16.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else if (aufgabe == 17) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA17.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else if (aufgabe == 18) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA18.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else if (aufgabe == 19) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Time.time1 = System.currentTimeMillis();
            RunA19.start();
            Time.time2 = System.currentTimeMillis();
            Time.calcTime();
        } else {
            System.out.println("Diese Augabe exsistiert nicht/wurde nicht bearbeitet!");
            System.out.print("Wähle eine der Folgenden Aufgaben aus: ");
            System.out.print("1");
            System.out.print(", 2");
            System.out.print(", 3");
            System.out.print(", 4");
            System.out.print(", 5");
            System.out.print(", 6");
            System.out.print(", 7");
            System.out.print(", 8");
            System.out.print(", 9");
            System.out.print(", 10");
            System.out.print(", 11");
            System.out.print(", 12");
            System.out.print(", 13");
            System.out.print(", 14");
            System.out.print(", 15");
            System.out.print(", 16");
            System.out.print(", 17");
            System.out.print(", 18");
            System.out.print(", 19");
        }
    }
}
