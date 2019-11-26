package lws.training.a4;

public class RunA4 {

    public static void start() {
        UserData user = new UserData();
        user.getDataFromUser();
        if(user.gender == Gender.male) {
            System.out.println("Willkommen Herr " + user.name + "!");
        } else if(user.gender == Gender.female) {
            System.out.println("Willkommen Frau " + user.name + "!");
        } else {
            System.out.println("Fehler im Programm!");
            System.out.println("Beende Programm...");
            System.exit(-1);
        }
    }

}
