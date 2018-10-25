package lws.training.a18;

import java.util.Random;

public class Rennschnecke {

    public String name;
    public String rasse;
    public int maxgeschwindigkeit;
    public long zurückgelegterWeg;
    private long time = 0;

    public Rennschnecke(String name, String rasse, int maxgeschwindigkeit) {
        this.name = name;
        this.rasse = rasse;
        this.maxgeschwindigkeit = maxgeschwindigkeit;
    }

    public void krieche() {
        Random random = new Random();
        this.zurückgelegterWeg = this.zurückgelegterWeg + random.nextInt(this.maxgeschwindigkeit) + 1;
        time++;
    }

    public String toString() {
        String data = "";
        data = data + "Name: " + this.name + "\n";
        data = data + "Rasse: " + this.rasse + "\n";
        data = data + "Maximale Geschwindigkeit: " + this.maxgeschwindigkeit + "\n";
        data = data + "Zurückgelegter Weg: " + this.zurückgelegterWeg + "\n";
        data = data + "Zeit: " + this.time + "\n";
        return data;
    }

}
