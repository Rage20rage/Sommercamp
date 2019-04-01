package lws.training.a18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Wettbüro {

    public static List<Wette> wetten = new ArrayList<>();
    private static int muletipler = 2;
    public static Rennen rennen = new Rennen("Hockenheim", 100);

    public static void wetteAnnehmen(String schneckenName, int wettEinsatz, String spieler) {
        if(wettEinsatz < 0) {
            System.out.println("Es können keine Negativen Wetten abgeschlossen werden!");
        } else {
            Rennschnecke rennschnecke = null;
            for (Rennschnecke rennschnecke1 : Rennen.rennschneckenListe) {
                if (rennschnecke1.name.equals(schneckenName)) {
                    rennschnecke = rennschnecke1;
                }
            }
            if (rennschnecke != null) {
                Wette wette = new Wette(rennschnecke, spieler, wettEinsatz);
                wetten.add(wette);
            }
        }
    }

    public static void rennendurchführen() {
        rennen.durchfuehren();
    }

    public static String toOneString() {
        String data = rennen.toString();
        data = data + "\n----------Wetten----------\n";
        int i = 1;
        for (Wette wette : wetten) {
            data = data + "\n----------Wette-" + i + "----------\n";
            data = data + "Spieler-Nme: " + wette.spielerName + "\n";
            data = data + "Wetteinsatz: " + wette.wetteinsatz + "\n";
            data = data + "Schnecken-" + wette.rennschnecke + "\n";
            if(wette.rennschnecke.zurückgelegterWeg >= rennen.streckenlänge) {
                data = data + "Gewinn: " + wette.wetteinsatz*muletipler + "\n";
            } else {
                data = data + "Gewinn: 0\n";
            }
            i++;
        }
       return data;
    }

}
