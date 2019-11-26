package lws.training.a18;

public class RunA18 {

    public static void start() {
        Rennschnecke rennschnecke = new Rennschnecke("Herbert", "Weinbergschnecke", 20);
        Wettbüro.rennen.addRennschnecke(rennschnecke);
        rennschnecke = new Rennschnecke("Franz", "Nacktschnecke", 15);
        Wettbüro.rennen.addRennschnecke(rennschnecke);
        rennschnecke = new Rennschnecke("Klaus", "Nacktschnecke", 17);
        Wettbüro.rennen.addRennschnecke(rennschnecke);
        Wettbüro.wetteAnnehmen("Herbert", 20, "Spieler-1");
        Wettbüro.wetteAnnehmen("Franz", 14, "Spieler-2");
        Wettbüro.wetteAnnehmen("Klaus", 10, "Spieler-3");
        Wettbüro.rennendurchführen();
        System.out.println(Wettbüro.toOneString());
    }

}
