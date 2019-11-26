package lws.training.a11;

import java.util.Scanner;

public class UserSelectBody {

    public static Body body;

    public static void select() {
        boolean continu = true;
        System.out.println("Wollen sie einen Quader (Q) einen  Zylinder (Z) oder eine Kugel (K) berechnen lassen?");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if(userInput.equalsIgnoreCase("Q")) {
            body = Body.cuboid;
            System.out.println("Bitte geben sie die Kantenlängen a, b und c des Quaders ein wenn sie dazu aufgefordert werden!");
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.print("Geben sie Kantenlänge a ein: ");
            scanner = new Scanner(System.in);
            double a = scanner.nextDouble();
            System.out.print("Geben sie Kantenlänge b ein: ");
            scanner = new Scanner(System.in);
            double b = scanner.nextDouble();
            System.out.print("Geben sie Kantenlänge b ein: ");
            scanner = new Scanner(System.in);
            double c = scanner.nextDouble();
            Geometry.calculeteCuboid(a, b, c);
        } else if(userInput.equalsIgnoreCase("Z")) {
            body = Body.cylinder;
            System.out.println("Bitte geben sie Radius und Höhe des Zylinders ein wenn sie dazu aufgefordert werden!");
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.print("Geben sie den Radius ein: ");
            scanner = new Scanner(System.in);
            double r = scanner.nextDouble();
            System.out.print("Geben sie die Höhe ein: ");
            scanner = new Scanner(System.in);
            double h = scanner.nextDouble();
            Geometry.calculeteCylinder(r, h);
        } else if(userInput.equalsIgnoreCase("K")) {
            body = Body.ball;
            System.out.println("Bitte geben sie Radius der Kugel ein wenn sie dazu aufgefordert werden!");
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.print("Geben sie den Radius ein: ");
            scanner = new Scanner(System.in);
            double r = scanner.nextDouble();
            Geometry.calculeteBall(r);
        } else {
            System.out.println("Fehler! Kein Gültiger Körper!");
            continu = false;
        }
    }

}
