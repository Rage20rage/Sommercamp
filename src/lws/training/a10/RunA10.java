package lws.training.a10;

public class RunA10 {

    public static void start() {
        WeatherData.fillWeatherData();
        System.out.println("Durchschnittstemperatur der letzten 2 Wochen: " + WeatherData.getAverageTemperature());
        System.out.println("Maximale Temperatur der letzten 2 Wochen: " + WeatherData.getMaxTemperature()
                + " am Tag " +WeatherData.maxTempDay);
        System.out.println("Minimale Temperatur der letzten 2 Wochen: " + WeatherData.getMinTemperature()
                + " am Tag " +WeatherData.minTempDay);
        WeatherData.calculatebigdifference();
        System.out.println("Größte Temperaturschwankung: " + WeatherData.differencenumber + " am Tag zwischen "
                + WeatherData.differencefirstday);
        WeatherData.displayTable();
    }

}
