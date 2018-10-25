package lws.training.a18;

import java.util.ArrayList;
import java.util.List;

public class Rennen {

    public String name;
    public int schneckenAnzahl;
    public static List<Rennschnecke> rennschneckenListe = new ArrayList<>();
    public long streckenlänge;

    public Rennen(String name, long streckenlänge) {
        this.name = name;
        this.streckenlänge = streckenlänge;
        schneckenAnzahl = rennschneckenListe.size()+1;
    }

    public void addRennschnecke(Rennschnecke rennschnecke) {
        schneckenAnzahl = rennschneckenListe.size()+1;
        if (rennschneckenListe.contains(rennschnecke)) {
            System.out.println("Die Schnecke " + name + " existiert schon!");
        } else {
            Rennen.rennschneckenListe.add(rennschnecke);
        }
    }

    public void removeRennschnecke(String name) {
        for (Rennschnecke rennschnecke : rennschneckenListe) {
            if(rennschnecke.name.equalsIgnoreCase(name)) {
                rennschneckenListe.remove(rennschnecke);
            }
        }
        schneckenAnzahl = rennschneckenListe.size()+1;
    }

    public String toString() {
        schneckenAnzahl = rennschneckenListe.size()+1;
        String data = "";
        int i = 1;
        for (Rennschnecke rennschnecke : rennschneckenListe) {
            data = data + " \n----------Schnecke-" + i + "----------\n";
            data = data + rennschnecke.toString();
            i++;
        }
        data = data + " \n---------Rennen-Infos--------\n";
        data = data + "Rennen Name: " + this.name + "\n";
        data = data + "Teilnehmer: " + this.schneckenAnzahl + "\n";
        data = data + "Streckenlänge: " + this.streckenlänge + "\n";
        return data;
    }

    private void lasseSchneckenKriechen() {
        for (Rennschnecke rennschnecke : rennschneckenListe) {
            rennschnecke.krieche();
        }
    }

    public void durchfuehren() {
        while (ermittleGewinner() == null) {
            lasseSchneckenKriechen();
        }
    }

    public String ermittleGewinner() {
        Rennschnecke gewinner = null;
        for (Rennschnecke schnecke : rennschneckenListe) {
            if(schnecke.zurückgelegterWeg >= this.streckenlänge) {
                if(gewinner == null) {
                    gewinner = schnecke;
                } else {
                    if(gewinner.zurückgelegterWeg == schnecke.zurückgelegterWeg) {
                        System.out.println("Es besteht ein Unentschieden zwischen 2 Schnecke " + gewinner.name + " und " + schnecke.name + "!");
                        System.out.println("Das rennen muss wiederholt werden!");
                        System.out.println("");
                        System.out.println("Zurückgelegter Weg: " + gewinner.zurückgelegterWeg);
                        System.exit(0);
                    } else if (gewinner.zurückgelegterWeg > schnecke.zurückgelegterWeg) {
                        //Erster Gewinnder bleibt, da Gewinner mehr gesammtweg
                    } else if(gewinner.zurückgelegterWeg < schnecke.zurückgelegterWeg) {
                        gewinner = schnecke;
                    }
                }
            }
        }
        if(gewinner == null) {
            return null;
        } else {
            return gewinner.toString();
        }
    }

}
