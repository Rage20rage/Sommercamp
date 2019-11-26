package lws.training.start;

public class Time {

    public static long time1;
    public static long time2;

    public static void calcTime() {
        long millis = time2 - time1;
        long seconds = 0;
        long minutes = 0;
        long hours = 0;
        while (millis >= 1000) {
            seconds++;
            millis-=1000;
        }
        while (seconds >= 60) {
            minutes++;
            seconds-=60;
        }
        while (minutes >= 60) {
            hours++;
            minutes-=60;
        }
        System.out.println();
        System.out.println("Zeit in der Aufgabe: " + hours + ":" + minutes + ":" + seconds + ":" + millis);
    }

}