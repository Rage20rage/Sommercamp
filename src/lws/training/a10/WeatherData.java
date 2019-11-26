package lws.training.a10;

import java.util.HashMap;

public class WeatherData {

    public static HashMap<Integer,Integer> dailytemperature = new HashMap<>();
    public static String maxTempDay;
    public static String minTempDay;
    public static int differencenumber;
    public static String differencefirstday;

    public static void fillWeatherData() {
        dailytemperature.put(1,12);
        dailytemperature.put(2,14);
        dailytemperature.put(3,9);
        dailytemperature.put(4,12);
        dailytemperature.put(5,15);
        dailytemperature.put(6,16);
        dailytemperature.put(7,15);
        dailytemperature.put(8,15);
        dailytemperature.put(9,11);
        dailytemperature.put(10,8);
        dailytemperature.put(11,13);
        dailytemperature.put(12,13);
        dailytemperature.put(13,15);
        dailytemperature.put(14,12);
    }

    public static Integer getAverageTemperature() {
        int average = 0;
        for (int i = 1; i <= 14; i++) {
            average += dailytemperature.get(i);
        }
        return (average/14);
    }

    public static Integer getMaxTemperature() {
        int maxTemperature = 0;
        boolean newmaxtemp = false;
        for (int i = 1; i <= 14; i++) {
            if(dailytemperature.get(i) > maxTemperature) {
                maxTemperature = dailytemperature.get(i);
                maxTempDay = "" + i;
                newmaxtemp = true;
            }
            if(dailytemperature.get(i) == maxTemperature && !newmaxtemp) {
                maxTempDay = maxTempDay + " sowie am Tag " + i;
            }
        }
        return maxTemperature;
    }

    public static Integer getMinTemperature() {
        int minTemperature = Integer.MAX_VALUE;
        boolean newmintemp = false;
        for (int i = 1; i <= 14; i++) {
            if(dailytemperature.get(i) < minTemperature) {
                minTemperature = dailytemperature.get(i);
                minTempDay = "" + i;
                newmintemp = true;
            }
            if(dailytemperature.get(i) == minTemperature && !newmintemp) {
                minTempDay = minTempDay + " sowie am Tag " + i;
            }
        }
        return minTemperature;
    }

    public static void calculatebigdifference() {
        for (int i = 1; i <= 13; i++) {
            boolean newdifference = false;
            int difference = dailytemperature.get(i) - dailytemperature.get(i+1);
            if(difference < 0) {
                difference = difference *(-1);
            }
            if(difference > differencenumber) {
                differencenumber = difference;
                differencefirstday = "" + i + " und " + (i+1);
                newdifference = true;
            }
            if(difference == differencenumber && !newdifference) {
                differencefirstday = differencefirstday + " sowie am Tag zwischen " + i + " und " + (i+1);
            }
        }
    }

    public static void displayTable() {
        String line1 = "";
        String line2 = "";
        for (int i = 1; i <= 14; i++) {
            if(i <= 9) {
                line1 = line1 + i + "  ";
            } else {
                line1 = line1 + i + " ";
            }
            if(dailytemperature.get(i) <= 9) {
                line2 = line2 + dailytemperature.get(i) + "  ";
            } else {
                line2 = line2 + dailytemperature.get(i) + " ";
            }
        }
        System.out.println("");
        System.out.println("Tag:        " + line1);
        System.out.println("Temperatur: " + line2);
        System.out.println("");
     }

}
