package lws.training.a4;

import java.util.Scanner;

public class UserData {

    public String name;
    public Gender gender;

    public void getDataFromUser() {
        getName();
        getGender();
    }

    private void getName() {
        System.out.print("Bitte gebe deinen Namen ein: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    }

    private void getGender() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte gebe dein Geschlecht an (Männlich \"m\", Weiblich \"w\"): ");
        String input = sc.nextLine();
        if(input.equalsIgnoreCase("w")) {
            gender = Gender.female;
        } else if(input.equalsIgnoreCase("m")) {
            gender = Gender.male;
        } else {
            getGender();
        }
    }

}
